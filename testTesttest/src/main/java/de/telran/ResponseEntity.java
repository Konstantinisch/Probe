package de.telran;

public class ResponseEntity {
    String name;
    public static int getInt (int i) {
        System.out.println(i);
        return i;
    }

    public ResponseEntity(String name) {
        this.name = name;
    }

    String getResponse () {

        return name;
    }


}
