package de.telran.fibonacci;

import static de.telran.fibonacci.FibonacciRecur_Stream.fibRec;

public class Fibonacci {

    public static long getFibonacci(int i) {
        int result = 0;
        int v1 = 0;
        int v2 = 1;
        for (int j = 1; j < i; j++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }


        return v2;
    }

    public static long getFibonacci2(int i) {
        int current = 0;
        int v1 = 0;
        int v2 = 1;
        for (int j = 1; j < i; j++) {
//            current = v1 + v2;
//            v1 = v2;
//            v2 = current;

            current = v2;
            v2 = v1 + v2;
            v1 = current;


        }
        return v2;
    }

    public static int getFib (int n){
        int result = 0;
        int num1 = 0;
        int num2 =1;
        for (int i = 0; i < n; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return num2;
    }

    public static void main(String[] args) {
        int n = 8;
        long Ftime = System.currentTimeMillis();
        System.out.println(getFibonacci2(n));
        long Ftime2 = System.currentTimeMillis() - Ftime;
        System.out.println("fib time = " + Ftime2);
        //System.out.println(getFib(8));


    }


}
