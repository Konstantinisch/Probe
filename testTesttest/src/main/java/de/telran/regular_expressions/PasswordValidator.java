package de.telran.regular_expressions;

import java.util.regex.Pattern;
public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&+=-]).{8,}$";
        return Pattern.matches(regex, password);
    }

    //String regex = "^(?=.[a-z])(?=.[A-Z])(?=.\d)(?=.[!@#$%^&+=-]).{8,}$";

    public static void main(String[] args) {
        String password = "Test@123";
        if (isValidPassword(password)) {
            System.out.println("Пароль корректен.");
        } else {
            System.out.println("Пароль некорректен.");
        }
    }
}

