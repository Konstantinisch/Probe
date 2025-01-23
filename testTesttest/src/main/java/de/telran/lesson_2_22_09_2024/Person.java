package de.telran.lesson_2_22_09_2024;

public class Person {

    Pet pet;
    String nameOfOwner;

    public Person(Pet name, String nameOfOwner) {
        this.pet = name;
        this.nameOfOwner = nameOfOwner;
    }

    public Person(String nameOfOwner) {
        pet = new Pet("null", "null",  "null");
        this.nameOfOwner = nameOfOwner;

    }
}
