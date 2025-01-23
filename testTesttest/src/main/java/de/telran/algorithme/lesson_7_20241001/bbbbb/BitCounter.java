package de.telran.algorithme.lesson_7_20241001.bbbbb;

public class BitCounter {
    public static int bitCount(int num) {
//vosvrat v dvoichnoj sisteme...? Pobitovie operazii...?
        int count = 0;

        while (num != 0) {
            num = num & (num -1);
            count++;
        }
        return count;

    }




    public static int removePair (int[] array) {
        //ischem chislo bes pari...udalenie par...
        int result = 0;
        for ( int i : array) {
            result = result ^ i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(bitCount(10));
    }
}
