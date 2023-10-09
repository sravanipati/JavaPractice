

class Animal {
    public void printAnimal() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public void printDog() {
        System.out.println("I am a dog");
    }

    public String getDogString() {
        return "dog";
    }
}

class Cat extends Animal {
    public void printCat() {
        System.out.println("I am a cat");
    }
}

public class DowncastExamples {
    public static void main(String[] args) {
        DowncastExamples dex = new DowncastExamples();

        Animal genericDog = new Dog();
        Animal genericCat = new Cat();

        dex.testDog((Dog) genericDog);
        dex.testCat((Cat) genericCat);

        dex.testAnimal((Dog) genericDog);
        dex.testAnimal((Cat) genericCat);

        dex.testAnimal(genericDog);
        dex.testAnimal(genericCat);

        if (((Dog) genericDog).getDogString().equals("dog")) {
            System.out.println("Matched!");
        }

        Cat c = (Cat) dex.passThrough(genericCat);
        c.printCat();
    }

    public void testAnimal(Animal animal) {
        System.out.println("Executing testAnimal with Animal type");
        animal.printAnimal();
    }

    public void testAnimal(Cat cat) {
        System.out.println("Executing testAnimal with Cat type");
        cat.printAnimal();
    }

    public void testAnimal(Dog dog) {
        System.out.println("Executing testAnimal with Dog type");
        dog.printAnimal();
    }

    public void testDog(Dog dog) {
        dog.printDog();
    }

    public void testCat(Cat cat) {
        cat.printCat();
    }

    public Object passThrough(Object o) {
        return o;
    }
}