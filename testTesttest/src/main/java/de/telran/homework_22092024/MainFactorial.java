package de.telran.homework_22092024;

import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        getFactorial(one);

    }
    public static void getFactorial(int one){
        for (int i = (one-1); i >1 ; i--) {
            one *=i;
        }
        System.out.println(one);
    }
}
