package de.telran.homework_22092024;

import java.util.Scanner;
import java.util.logging.Logger;

public class
MainFactorial_2 {
    public static void main(String[] args) {
//        System.out.println("Enter a number");
//        int i = new Scanner(System.in).nextInt();
//        int x = 1;
//        logger.info("Test");
//        for (int j = 1; j <=i; j++) {
//            x *=j;
//
//            System.out.println("Factorial of number "+j+ " = "+x);
//        }
//        System.out.println();
//        System.out.println("Factorial of \nnumber "+i+ " = "+x);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int enter = scanner.nextInt();
//        int t = 1;
//        for (int i = 1; i <=enter ; i++) {
//            t *=i;
//            System.out.println("Factorial of number "+i+" is "+t);
//        }
//        System.out.println();
//        System.out.println("Factorial of number "+enter+" is "+t);


//        System.out.println("Enter a number");
//        int scan = new Scanner(System.in).nextInt();
//        int fact = 1;
//        for( int i = 1; i <=scan; i++){
//            fact *=i;
//
//
//        }
//        System.out.println("Factorial of number "+scan+" = "+fact);

//        for (int i = 1; i <10 ; i++) {
//            for (int j = 1; j <=5 ; j++) {
//                System.out.print(i+" * "+j+" = "+(i*j)+"\t");
//            }
//            System.out.println();
//
//        }
//
//        int i = 10;
//       while (true) {
//           if (i > 5) {
//               System.out.println("Number = " + i);
//            i--;
//            } else {
//                break;
//            }
//        }
//

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = 1;
        for (int g = 1; g <=number ; g++) {
            fact *=g;
            System.out.println("Factorial of " + g + " is " + fact);


        }
        System.out.println();
        System.out.println("Factorial of " + number + " is " + fact);

//        for (int i = 1; i <10; i++) {
//            for (int j = 1; j < 6 ; j++) {
//                System.out.print(i+" * " + j + " = " + (i*j) + "\t");
//            }
//            System.out.println();
//
//        }
    }
//    static Logger logger = Logger.getLogger(MainFactorial_2.class.getName());
}
