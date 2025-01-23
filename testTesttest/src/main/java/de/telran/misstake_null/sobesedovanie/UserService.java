package de.telran.misstake_null.sobesedovanie;



public class UserService {
    public void printUserInfo(User user) {
        if (user == null) {
            System.out.println("Пользователь не найден.");
            return;
        }

        if (user.getName() == null || user.getEmail() == null) {
            System.out.println("Информация о пользователе неполная.");
            return;
        }

        System.out.println("Имя: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }

    public static void main(String[] args) {
        User user1 = new User("Иван", "ivan@example.com");
        User user2 = new User(null, "user2@example.com");
        User user3 = new User("Olga","III@JJH.de");

        UserService userService = new UserService();
        userService.printUserInfo(user1); // Ожидаемый вывод: Имя: Иван, Email: ivan@example.com
        userService.printUserInfo(user2); // Ожидаемый вывод: Информация о пользователе неполная.
        userService.printUserInfo(user3); // Ожидаемый вывод: Пользователь не найден.
    }
}

