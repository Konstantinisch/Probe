package de.telran.homework_22092024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForForeach {
    public static void main(String[] args) {
        List<Car> str =new ArrayList<>();
        str.addAll(Arrays.asList(new Car("VW", 250), new Car("Opel", 200)));

//        for(int i = 0; i<str.size(); i++){
//            System.out.println(str.get(i).name+ " "+str.get(i).speed);
//        }
//        System.out.println();

        for(Car name: str){ // tip dannih, objavljaju peremennuju, collection
            System.out.print(name.name+" "+name.speed);
            System.out.println();
        }
//
//        //Цикл while
//Цикл while используется, когда заранее неизвестно количество итераций, и выполнение цикла зависит
// от выполнения условия, которое может измениться динамически.
//        while(true){
//            System.out.println(str);
//        }
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true) {
            System.out.println("Введите команду (exit для выхода):");
            command = scanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("Игра окончена.");
                break;
            } else {
                System.out.println("Команда: " + command);
            }
        }
    }


}
