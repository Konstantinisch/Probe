package de.telran.homework_22092024;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = scan.nextInt();

        System.out.println("Enter a second number");
        int b = scan.nextInt();
        System.out.println("Enter a ariphmetic sign");
        String ariphmetic = scan.next();
        if (ariphmetic.equals("+")) {
            System.out.println("Result of Addition = " + (a + b));
        } else if (ariphmetic.equals("-")) {
            System.out.println("Result of Subtraktion = " + (a - b));
        } else if (ariphmetic.equals("*")) {
            System.out.println("Result of Multiplikation = " + (a * b));
        } else if (ariphmetic.equals("/")) {
            try {
                div(a, b);
            } catch (ArithmeticException es) {
                System.out.println("Division by zero is not allowed");
            }

        } else if (ariphmetic.equals("%")) {
            System.out.println("Result of Division = " + (a % b));

        }else if (scan.equals(a))    // ???????
            try {
                scan.equals(a);
            } catch (InputMismatchException e) {

                System.out.println("Wrong sign");
            }

//        div(a, b);


    }


    public static int div(int a, int b) throws IOException {

        int res;
        res = a / b;
        return res;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
