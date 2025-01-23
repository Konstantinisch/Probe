package de.telran.iterator;

import java.util.*;

public class MainIterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Birne");
        fruits.add("Orange");

        Iterator<String> iterator= fruits.iterator();
        while(iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
            if("Banana".equals(fruit)){
                iterator.remove();
            }
        }
        System.out.println(fruits);

        for (int i = 0; i <fruits.size() ; i++) {
            System.out.println(fruits);
            fruits.remove(i);
        }
        for (String list : fruits) {

            System.out.println(list.repeat(3));

        }
        int[]arr =  {1,3,5,6};
        System.out.println(arr.length);
        Iterator<Integer> it = Arrays.stream(arr).iterator();
        while(!it.hasNext()){
            int a = it.next();
            System.out.println(a);
        }

    }
}
