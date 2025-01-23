package de.telran.misstake_null;

import java.util.List;

public class MainNull{
    public static String findFirstNonNull(List<String> strings) {
        for (String s : strings) {
            if (s != null && !s.isEmpty()) {
                return s;
            }
        }
        return null; // Это корректное значение, если все строки пустые или null
    }

    public static void main(String[] args) {
        List<String> strings = List.of( null, "", "Hello", "World");
        String result = findFirstNonNull(strings);
        System.out.println(result); // Ожидается "Hello"
    }
}
