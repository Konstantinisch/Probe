package de.telran.homework_22092024;

public class Vehicle {

    //Задание: Создание системы управления транспортными средствами
    //Цель: Создать базовый класс для транспортных средств и несколько производных классов.
    // Затем использовать полиморфизм и switch для обработки различных видов транспортных средств.
    //
    //Шаги:
    //Создать базовый класс Vehicle:
    //
    //Создайте класс Vehicle с полями: name (имя) и speed (скорость).
    //Добавьте метод void displayInfo(), который будет выводить информацию о транспортном средстве.
    //Создать производные классы:
    //
    //Создайте классы Car, Bicycle и Motorcycle, которые наследуются от Vehicle.
    //Переопределите метод displayInfo() в каждом классе, чтобы выводить специфичную информацию для
    // каждого типа транспортного средства.
    //Создать класс VehicleManager:
    //
    //В этом классе создайте метод void manageVehicle(Vehicle vehicle), который будет принимать
    // объект типа Vehicle.
    //Используйте оператор switch на основе типа транспортного средства для выполнения различных
    // действий (например, выводить разную информацию или выполнять разные операции).
    //Тестирование:
    //
    //Создайте несколько объектов различных транспортных средств и передайте их в метод manageVehicle().

    String name;
    int speed;

    public Vehicle() {
    }

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public String  displayInfo(){
      return "";
    }
}
