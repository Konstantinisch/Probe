package de.telran.homework_22092024;

import java.util.Scanner;
import java.util.logging.Logger;

public class Account {
    //Задание: Регистрация и вход в аккаунт с использованием класса Scanner
    //
    //Описание:
    //Тебе необходимо реализовать простую программу, которая будет:
    //
    //Регистрировать новый аккаунт.
    //Просить пользователя ввести логин и пароль для входа в уже существующий аккаунт.
    //Шаги:
    //При старте программы, предложи пользователю зарегистрировать новый аккаунт (ввести логин и пароль).
    //После успешной регистрации, программа должна попросить пользователя авторизоваться, то есть ввести логин и пароль, чтобы войти в аккаунт.
    //Если данные при входе совпадают с зарегистрированными данными, вывести сообщение об успешном входе. В противном случае — сообщение об ошибке.
    //Требования:
    //Использовать класс Scanner для ввода данных.
    //Программа должна хранить данные о логине и пароле (например, в переменных).
    //После регистрации пользователь должен авторизоваться с теми же данными.
    public static void main(String[] args) {
        String password = "ODER";
        String account = "KKK@UU.OO";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Account Name");

        logger.info("TEST TEST TEST");

        recursivLogin(account, scan);

        System.out.println("Enter password");

        recursivPassword(password, scan);
    }

    public static Logger logger = Logger.getLogger(Account.class.getName());

    public static int count = 3;
    public static int count1 = 3;

    public static void recursivLogin(String account, Scanner scan) {
//    if(count ==0)
//        System.exit(0);
        exit();
        String currentAccount = scan.nextLine();

        if (!account.equals(currentAccount)) {
            System.out.println("Your Account is wrong. Enter again");
            count--;
            System.out.println(" You have " + count + " more attemps");
            recursivLogin(account, scan);
        } else {
            System.out.println("Loging is succesfull");


        }
    }

    public static void recursivPassword(String password, Scanner scan) {
//        if(count ==0)
//            System.exit(0);
        exit();
        String currentPassword = scan.nextLine();
        if (password.equals(currentPassword)) {
            System.out.println("Logging of password is successfully");

        } else {

            System.out.println("Your Password is wrong. Enter again");
            count1--;
            System.out.println(" You have " + count1 + " more attemps");
            recursivPassword(password, scan);
        }
    }

    public static void exit() {
        if (count == 0 || count1 == 0)
            System.exit(0);
    }

}

