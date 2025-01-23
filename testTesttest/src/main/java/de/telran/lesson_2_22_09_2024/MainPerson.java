package de.telran.lesson_2_22_09_2024;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person(new Pet("Mursik","03.03.03", "Black"), "Peter");
        System.out.println(person1.nameOfOwner+ "  has a cat " + person1.pet.name+ " "
                +person1.pet.color+ "was born on "+person1.pet.dateOfBirthday+".");

        Person person2 = new Person("Alex");
        System.out.println(person2.nameOfOwner + " " + person2.pet.name);
//



        //Динамический полиморфизм позволяет подклассу предоставлять свою
        // реализацию метода, который уже существует в его родительском классе.
//        Animal myAnimal = new Animal();
//        Animal myDog = new Dog();
//        Animal myCat = new Cat();
//        myAnimal.sound();
//        myDog.sound();
//        myCat.sound();



        //Статический полиморфизм позволяет объявлять несколько методов с одинаковым именем,
        // но разными параметрами
    }
}
