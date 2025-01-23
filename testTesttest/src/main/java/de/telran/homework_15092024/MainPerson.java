package de.telran.homework_15092024;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Paul",23,"jgh@kjh");
        String personName = person1.getName();
        int personAge = person1.getAge();
        String personEmail = person1.getEmail();

        System.out.println("Name of Person is "+personName);
        System.out.println("Age of Person is "+personAge);
        System.out.println("His Email is "+personEmail);

        person1.setAge(-2);
        //System.out.println("New age of Person is "+person1.getAge());

//        person1.setName("Peter");
//        person1.setAge(-2);
//        person1.setEmail("KKKKK@LL.OO");
//
//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());
//        System.out.println(person1.getEmail());

    }
}
