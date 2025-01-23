package de.telran.homework_15092024;

public class Person {

  /*  Задание: Разработать классы с инкапсуляцией
    Создай класс Person, который будет представлять человека.

    Поля класса должны быть закрытыми (private):

    String name — имя человека.
    int age — возраст человека.
    String email — электронная почта.
    Создай публичные методы для доступа к полям (get и set методы):

    Методы getName(), getAge(), getEmail() — для получения значений.
            Методы setName(String name), setAge(int age), setEmail(String email) — для
             задания значений.
    В методе setAge(int age) добавь проверку: если возраст меньше 0, то значение не
    должно устанавливаться,
    и в консоль должно выводиться сообщение: "Некорректный возраст".

    Напиши класс Main с методом main, в котором:

    Создай объект класса Person.
    Задай значения для полей с помощью сеттеров.
    Выведи информацию о человеке с помощью геттеров.
    Попробуй установить некорректный возраст и проверь работу проверки.*/

    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }else {
            System.out.println("Mistake: Некорректный возраст");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
