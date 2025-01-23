package de.telran.exception;

public class MainPersonAge {
    public static void main(String[] args) throws InvalidAgeException {
        Person person = new Person();

        try {
            person.setAge(123);
            //System.out.println("The age of this person is ");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}
