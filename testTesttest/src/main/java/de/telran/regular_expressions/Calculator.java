package de.telran.regular_expressions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a first Number");
//        int firstNumber =scan.nextInt();
//        System.out.println("Enter a second Number");
//        int secondNumber = scan.nextInt();
//        System.out.println("Enter a sign");
//        String ariphmetic = scan.next();
//
//        if (ariphmetic.equals("+")){
//            System.out.println(firstNumber+secondNumber);
//        } else if (ariphmetic.equals("-")) {
//            System.out.println(firstNumber-secondNumber);
//        } else if (ariphmetic.equals("*")) {
//            System.out.println(firstNumber*secondNumber);
//        } else if (ariphmetic.equals("/")) {
//            System.out.println(firstNumber/secondNumber);
//        }

        Scanner scan = new Scanner(System.in);
        int g = scan.nextInt();
        int fact= 1;
        for (int i = 1; i <=g; i++) {
            fact *=i;
            System.out.println("Factorial of Number "+i+" is "+fact);
        }
        System.out.println();
        System.out.println("Factorial of Number "+g+" is "+fact);
    }

}
