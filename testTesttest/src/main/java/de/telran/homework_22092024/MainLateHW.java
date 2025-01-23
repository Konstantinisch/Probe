package de.telran.homework_22092024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainLateHW {
    public static void main(String[] args) {
        //  //Задание 1: Цикл for
        //    //Задача: Написать программу, которая выводит все простые числа от 2 до 100.
        //    //
        //    //Подсказка: Простое число — это число, которое делится только на себя и на 1.
        //    //[22:18]
        //    //Задание 2: Цикл for-each
        //    //Задача: Написать программу, которая принимает список целых чисел и умножает каждое число
        //    // на * 2.
        //    //[22:19]
        //    //Задание 3: Цикл while
        //    //Задача: Написать программу, которая спрашивает пользователя пароль до тех пор, пока
        //    // он не введет правильный. Пароль — это строка "password123". После успешного ввода программа
        //    // должна вывести сообщение "Пароль верен".

        for (int i = 2; i <= 100; i++) {
            if (i >= 45 && i < 46) {
                System.out.print("\n");
            }
            if (i >= 84 && i < 85)
                System.out.print("\n");
            System.out.print(i + " ");


        }
        System.out.println(" \n");
//        Scanner scan = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        boolean flag = true;
//        System.out.println("Enter number or exit ");
//        while (flag) {
//            String input = scan.nextLine();
//            if (input.equalsIgnoreCase("exit")) {
//                flag = false;
//            } else {
//                try {
//                    int number = Integer.parseInt(input);
//                    list.add(number *2);
//                } catch (Exception t) {
//                    t.printStackTrace();
//                }
//            }
//        }
//        System.out.println(list);
//
//        scan.close();


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3,123, 456, 309876, 4, 5));
        System.out.print("Result of our moving = ");
        for (Integer lst : list1) {
            System.out.print(lst * 2 + ",");
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter your password ");
        while (flag) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("password123")) {
                flag = false;
                System.out.println("Password is true");
            }
        }

    }


}
