package de.telran.exception;

public class Person {
     int age;




   void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) throw new InvalidAgeException("Incorrect");
        System.out.println("The age of this person is "+age+".");
        //System.out.println("The age of this person couldn't be "+age);



    }
}

