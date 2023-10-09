
abstract class WillHaveManySubTypes {

    public abstract void doXYourWay();

    public abstract void doYYourWay();

    public abstract String toString();

    final void doZOnlyOneWay() {
        System.out.println("Z can only be done this way");
    }
}

public class FinalMethodExample extends WillHaveManySubTypes {
    private boolean flag = false;

    public static void main(String[] args) {

        FinalMethodExample e = new FinalMethodExample();
        e.doXYourWay();
        e.doYYourWay();
        e.doZOnlyOneWay();
        System.out.println(e);
    }

    public void doXYourWay() {
        System.out.println("Implemented X my way");
    }

    public void doYYourWay() {
        System.out.println("Implemented Y my way");
    }

    public String toString() {
        return "Not implemented yet";
    }
}