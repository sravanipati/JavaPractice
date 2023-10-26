import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectricCarTrip {

	public static int tripNumber = 0;
	public String city;
	public String trip;
	float batteryCapacity;
	float batterySize;
	Map<Integer, Participant> tripDetails = new HashMap<>();
	Map<Integer, String> resultLocation = new HashMap<>();
	Map<Integer, Integer> resultCharge = new HashMap<>();
	List<String> locationDistance;

	public ElectricCarTrip(String trip) {
		try {
			if (trip == null) {
				throw new UnsupportedOperationException("Please enter the trip details");
			}
			this.trip = trip;
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public String locationOf(int participantId) {
		try {
			if (resultLocation.isEmpty()) {
				throw new UnsupportedOperationException();
			} 
				else if (resultLocation.get(participantId).contains(":")) {
				return resultLocation.get(participantId).split(":")[0];
			}
		else {
				return resultLocation.get(participantId);
			}

		} catch (Exception e) {
			System.out.println("We can't reach any location using this battery");
		}
		return null;

	}

	public int startTripIn(String city, int batterySize, int lowSpeedPerformance, int highSpeedPerformance) {

		try {
			tripNumber++;
			this.city = city;
			this.batterySize = batterySize;
			tripDetails.put(tripNumber, new Participant(city, batterySize, lowSpeedPerformance, highSpeedPerformance));
			locationDistance = Arrays.asList(trip.split("-"));
			return tripNumber;

		} catch (Exception e) {
			throw new UnsupportedOperationException();
		}

	}

	public void goWithLowSpeed(int participantId) {

		try {
			Participant travelDetails = tripDetails.get(participantId);
			int lowSpeed = travelDetails.lowSpeedPerformance;
			batteryCapacity = travelDetails.batterySize;
			float abilityToTravel = batteryCapacity * lowSpeed, result = 0;
			int startLocation = locationDistance.indexOf(travelDetails.city), endLocation = locationDistance.size(),
					interDistance = 0;
//			System.out.println(endLocation);

			for (int j = startLocation; j < endLocation-1; j += 2) {
				interDistance = Integer.parseInt(locationDistance.get(j+1));
				if (interDistance <= abilityToTravel) {
					city = locationDistance.get(j+2);
					batteryCapacity = batteryCapacity - (interDistance / lowSpeed);
					abilityToTravel = batteryCapacity * lowSpeed;
					result = Math.round((batteryCapacity / batterySize) * 100);
					
				}
				resultLocation.put(participantId, city);
				resultCharge.put(participantId, (int) result);
			}

		} catch (Exception e) {
			throw new UnsupportedOperationException();
		}

	}

	public String chargeOf(int participantId) {
		try {
			if (resultCharge.isEmpty()) {
				throw new UnsupportedOperationException();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return resultCharge.get(participantId) + "%";

	}

	public void goWithHighSpeed(int participantId) {

		try {

			Participant travelDetails = tripDetails.get(participantId);
			int highSpeed = travelDetails.highSpeedPerformance;
			batteryCapacity = travelDetails.batterySize;
			float abilityToTravel = batteryCapacity * highSpeed,result=0;
			int startLocation = locationDistance.indexOf(travelDetails.city), endLocation = locationDistance.size(),
					interDistance = 0;

			for (int j = startLocation; j < endLocation-1; j += 2) {
				interDistance = Integer.parseInt(locationDistance.get(j+1));
				if (interDistance <= abilityToTravel) {
					city = locationDistance.get(j+2);
					batteryCapacity = batteryCapacity - (interDistance / highSpeed);
					abilityToTravel = batteryCapacity * highSpeed;
					result = Math.round((batteryCapacity / batterySize) * 100);
				}
				resultLocation.put(participantId, city);
				resultCharge.put(participantId, (int) result);
			}

		} catch (Exception e) {
			throw new UnsupportedOperationException();
		}

	}

	public void charge(int id, int hoursOfCharge) {
		try {

			Participant travelDetails = tripDetails.get(id);
			
			if (resultLocation.get(id).contains(":")) {
				String[] charge = resultLocation.get(id).split(":");
				int allowChargeCapacity = Integer.parseInt(charge[1]);
				travelDetails.batterySize = resultCharge.get(id) + allowChargeCapacity * hoursOfCharge;
				travelDetails.city = resultLocation.get(id);
			}
			else {
				throw new UnsupportedOperationException();
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		System.out.println("Task1: START"); 
		shouldGetAtDestinationWithLowerCharge();
		System.out.println("Task1: COMPLETE\n");
		
		System.out.println("---------------------------------------------");

		System.out.println("Task2: START"); 
		shouldGoToFinalDestination();
		System.out.println("Task2: COMPLETE\n");

		System.out.println("---------------------------------------------");
		
		System.out.println("Task3: START");
		shouldStayAtIntermediateStopIfNotEnoughCharge();
		System.out.println("Task3: COMPLETE\n");

		System.out.println("---------------------------------------------");
		
		System.out.println("Task4: START");
		shouldConsumeMoreWhenSprinting();
		System.out.println("Task4: COMPLETE\n");

		System.out.println("---------------------------------------------");
		

		System.out.println("Task5: START");
		shouldMoveMultipleParticipantsAccordingly();
		System.out.println("Task5: COMPLETE\n");

		System.out.println("---------------------------------------------");

		System.out.println("Task6: START");
		shouldAllowCharging();
		System.out.println("Task6: COMPLETE");


	}


	public static void shouldGetAtDestinationWithLowerCharge() {

		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER");
		int batterySize = 85; // KWh
		int lowSpeedPerformance = 5; // miles per KWh 
		int highSpeedPerformance = 5; // miles per KWh 
		int participantId =trip.startTripIn("EDINBURGH", batterySize, lowSpeedPerformance,highSpeedPerformance); //1
		trip.goWithLowSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print MANCHESTER 
		System.out.println(trip.chargeOf(participantId)); // Should print41%
	}

	public static void shouldGoToFinalDestination() {

		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER-100-LEEDS");
		int participantId = trip.startTripIn("EDINBURGH", 85, 5, 5);
		trip.goWithLowSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print LEEDS
		System.out.println(trip.chargeOf(participantId)); // Should print 18%

	}

	public static void shouldStayAtIntermediateStopIfNotEnoughCharge() {
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER-500-LONDON");
		int participantId = trip.startTripIn("EDINBURGH", 85, 5, 5); trip.goWithLowSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(participantId)); // Should print 41% 
		trip.goWithLowSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(participantId)); // Should print 41% 
	}

	public static void shouldConsumeMoreWhenSprinting() {

		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER-100-BIRMINGHAM");
		int participantId = trip.startTripIn("EDINBURGH", 85, 5, 3);
		trip.goWithHighSpeed(participantId);
		System.out.println(trip.locationOf(participantId)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(participantId)); // Should print 2%
	}


	public static void shouldMoveMultipleParticipantsAccordingly() {
		
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER-100-BIRMINGHAM");
		int id1 = trip.startTripIn("EDINBURGH", 85, 5, 3);
		int id2 = trip.startTripIn("MANCHESTER", 70, 5, 3);
		trip.goWithHighSpeed(id1);
		trip.goWithLowSpeed(id2);
		System.out.println(trip.locationOf(id1)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(id1)); // Should print 2%
		System.out.println(trip.locationOf(id2)); // Should print BIRMINGHAM
		System.out.println(trip.chargeOf(id2)); // Should print 71%
	}


	public static void shouldAllowCharging() { 
		ElectricCarTrip trip = new ElectricCarTrip("EDINBURGH-250-MANCHESTER:25-100-BIRMINGHAM"); // 25 is the KWh // charged per hour // at MANCHESTER
		int id =trip.startTripIn("EDINBURGH", 85, 5, 3);
		trip.goWithHighSpeed(id);
		System.out.println(trip.locationOf(id)); // Should print MANCHESTER
		System.out.println(trip.chargeOf(id)); // Should print 2% 
		int hoursOfCharge = 3;
		trip.charge(id, hoursOfCharge); 
		trip.goWithHighSpeed(id);
		System.out.println(trip.locationOf(id)); // Should print BIRMINGHAM
		System.out.println(trip.chargeOf(id)); // Should print 51% 
	}

}