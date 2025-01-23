package de.telran.misstake_null.sobesedovanie;


import java.util.UUID;

class Singleton {
    private static Singleton single = null;
    private String ID = null;

    private Singleton() {
        ID = UUID.randomUUID().toString();
    }

    public static Singleton getInstance() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    public String getID() {
        return this.ID;
    }
}

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = null;

        try {
            s = Singleton.getInstance();
        } catch
                (NullPointerException e) {
                System.out.println("Incorrect");
                 return;
        }


        System.out.println(s.getID());

        s = Singleton.getInstance();
        System.out.println(s.getID());
    }
}



