package de.telran.homework_22092024;

import java.util.Scanner;

public class Account_same {
    public static void main(String[] args) {

        String account = "nnn@kk.de";
        String password = "tree";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account name ");
        recursAccount(account, scan);
        System.out.println("Enter your password");
        recursPassword(password,scan);

    }

    public static int count = 3;
    public static int count1 = 3;

    public static void recursAccount(String account, Scanner scan) {
        exit();
        String currentAccount = scan.nextLine();
        if (!account.equals(currentAccount)) {
            System.out.println("Your account name is wrong. Try it again");
            count--;
            System.out.println("You have " + count + " more attemps");
            recursAccount(account, scan);

        } else {
            System.out.println("Your logging were successfully");
        }

    }

    public static void recursPassword(String password, Scanner scan) {
        exit();
        String currentPassword = scan.nextLine();
        if (!password.equals(currentPassword)){
            System.out.println("Your password is wrong. Try it again");
            count1--;
            System.out.println("You have " +count1 + " more attempts");
            recursPassword(password, scan);

        }else {
            System.out.println("Your password is successfully");
        }

    }

    public static void exit() {
        if (count == 0 || count1 ==0) {
            System.out.println("You have no more attempts");
            System.exit(0);
        }
    }
}
