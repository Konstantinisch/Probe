package de.telran;

public class MainResponsEntity {
    public static void main(String[] args) {
        System.out.println(new ResponseEntity("John").getResponse());

        ResponseEntity responseEntity = new ResponseEntity("Ilja");
        System.out.println(responseEntity.getResponse());

        ResponseEntity.getInt(45);


    }
}
