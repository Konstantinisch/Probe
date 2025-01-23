package de.telran;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TaskKursor {
    public static void main(String[] args) {
        System.out.println(isAtStart("AABBCCDD"));

        Timestamp time = new Timestamp(System.currentTimeMillis());
        System.out.println(time);



        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp fromLocalDateTime = Timestamp.valueOf(localDateTime);
        System.out.println(fromLocalDateTime);
        System.out.println(localDateTime);



    }

    public static boolean isAtStart(String path) {
        if (path.length() % 2 != 0) return false;

        int countRow = 0;
        int countColumn = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'A') {
                countColumn++;
            }
            if (path.charAt(i) == 'B') {
                countRow++;
            }
            if (path.charAt(i) == 'C') {
                countColumn--;
            }
            if (path.charAt(i) == 'D') {
                countRow--;
            }
        }
        return countRow == countColumn;
    }
}