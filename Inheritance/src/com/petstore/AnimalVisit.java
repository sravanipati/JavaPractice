package com.petstore;

import java.time.LocalDate;
 
class Dog extends Animal {
 
    private int pedigreeId;
 
    private LocalDate chipDate;
 
    public Dog(String name, String owner, String breed,
               AnimalType type, int pedigreeId) {
        super(name, owner, breed, type);
        this.pedigreeId = pedigreeId;
    }
 
    public String toString() {
        String str = super.toString();
        if (pedigreeId > 0) {
            str += " (pedigree Id = " + pedigreeId + ")";
        }
        return str;
    }
 
    public static void examineAnimal() {
        System.out.println("Examine for breathing problems");
    }
 
    public LocalDate getChildChipDate() {
        System.out.println("child getChildChipDate");
        return chipDate;
    }
 
    public void setChipDate(LocalDate chipDate) {
        this.chipDate = chipDate;
    }
}
 
public class AnimalVisit {
    public static void main(String[] args) {
 
        Dog pug = new Dog("George", "Ralph", "Pug", Animal.AnimalType.DOG, 775533);
 
        pug.setChipDate(LocalDate.now());
 
        System.out.println(pug);
 
        System.out.println("Chip Date = " + pug.getChipDate());
 
        Animal a = pug;
        System.out.println("Chip Date = " + a.getChipDate());
 
        System.out.println("Chip Date = " + pug.getChildChipDate());
 
        Animal.examineAnimal();
        Dog.examineAnimal();
    }
}