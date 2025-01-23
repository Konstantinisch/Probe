package de.telran.map;

import java.util.*;

public class MapHT {
    public static void main(String[] args) {
//        System.out.println("Enter a number");
//        Scanner scanner =new Scanner(System.in);
//        int number = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter a "+number+" words");
//
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < number; i++) {
//            String word = scanner.nextLine();
//           if (map.containsKey(word)){
//              int currentvalue =  map.get(word);
//              currentvalue++;
//              map.replace(word,currentvalue);
//               System.out.println("new key-value: "+currentvalue);
//           } else {
//               System.out.println("The word is added");
//               map.put(word,1);
//           }
//
//        }
//        System.out.println(map);


//        System.out.println("Enter a number");
//        Scanner scan = new Scanner(System.in);
//        int number1 = scan.nextInt();
//        scan.nextLine();
//        System.out.println("Enter a "+number1+" words");
//
//        Map<String, Integer> map1 = new HashMap<>();
//        for (int i = 0; i <number1 ; i++) {
//            String word1 = scan.nextLine();
//            if (map1.containsKey(word1)){
//                int currentvalue1 = map1.get(word1);
//                currentvalue1++;
//                map1.replace(word1,currentvalue1);
//                System.out.println("New key-value1 = "+currentvalue1);
//            }else {
//                System.out.println("The word is added");
//                map1.put(word1,1);
//
//            }
//        }
//
//        System.out.println(map1);

//        System.out.println("Enter a number");
//        Scanner scan2 = new Scanner(System.in);
//        int number2 = scan2.nextInt();
//        scan2.nextLine();
//        System.out.println("Enter a " + number2 + " words!");
//        Map<String, Integer> map2 = new LinkedHashMap<>();
//        for (int i = 0; i < number2; i++) {
//            String word2 = scan2.nextLine();
//            if (map2.containsKey(word2)) {
//                int currentvalue2 = map2.get(word2);
//                currentvalue2++;
//                map2.replace(word2, currentvalue2);
//                System.out.println("New key-value = " + currentvalue2);
//            } else {
//                map2.put(word2, 1);
//                System.out.println("The word is added");
//            }
//        }
//        System.out.println(map2);
//
//        System.out.println("Enter a number");
//        Scanner scan3 = new Scanner(System.in);
//        int number3 = scan3.nextInt();
//        scan3.nextLine();
//        System.out.println("Enter a " + number3 + " words");
//
//
//        Map<String, Integer> map3 = new HashMap<>();
//        for (int i = 0; i < number3; i++) {
//            String word3 = scan3.nextLine();
//            if (map3.containsKey(word3)) {
//                int currentvalue3 = map3.get(word3);
//                currentvalue3++;
//                map3.replace(word3, currentvalue3);
//                System.out.println(" The new key-value -> " + currentvalue3);
//            } else {
//                map3.put(word3, 1);
//                System.out.println("Is added");
//            }
//        }
//        System.out.println(map3);

//        System.out.println("Enter a number");
//        Scanner scan4 =new Scanner(System.in);
//        int number = scan4.nextInt();
//        System.out.println("Enter a "+number+" words");
//        scan4.nextLine();
//
//        Map<String, Integer> map4 = new LinkedHashMap<>();
//        for (int i = 0; i <number ; i++) {
//            String word4 = scan4.nextLine();
//            if(map4.containsKey(word4)){
//                int currentvalue4 = map4.get(word4);
//                currentvalue4++;
//                map4.replace(word4, currentvalue4);
//                System.out.println("The new key-value is "+currentvalue4);
//            }else {
//                map4.put(word4,1);
//                System.out.println("The "+word4+" is added!");
//            }
//        }
//        System.out.println(map4);
//
//        Map<String, Integer>test = new TreeMap<>();
//        test.put("TTT",5);
//        test.put("DDD",5);
//        test.put("TTT",5);
//        test.put("III",5);
//        for (Map.Entry<String,Integer>entry : test.entrySet()){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//
//        }
//        System.out.println(test);

//        System.out.println("Enter a number");
//        Scanner scanner5 = new Scanner(System.in);
//        int number5 = scanner5.nextInt();
//        System.out.println("Enter a " + number5 + " words.");
//        scanner5.nextLine();
//
//        Map<String, Integer> map5 = new HashMap<>();
//        for (int i = 0; i <number5 ; i++) {
//            String word5 = scanner5.nextLine();
//            if (map5.containsKey(word5)){
//                int currentvalue5 = map5.get(word5);
//                currentvalue5++;
//                map5.replace(word5,currentvalue5);
//                System.out.println("The new key-value is " + currentvalue5);
//            }else {
//                map5.put(word5, 1);
//                System.out.println("The " + word5 + " is added!");
//            }
//        }
//        System.out.println(map5);

        System.out.println("Enter a number");
        Scanner scanner6 = new Scanner(System.in);
        int number6 = scanner6.nextInt();
        System.out.println("Enter a " + number6 + " words!");
        scanner6.nextLine();

        Map<String, Integer> map6 = new LinkedHashMap<>();
        for (int i = 0; i < number6 ; i++) {
            String word6 = scanner6.nextLine();
            if (map6.containsKey(word6)){
                int currentValue = map6.get(word6);
                currentValue++;
                map6.replace(word6,currentValue);
                System.out.println("That is a new key/value "+currentValue);
            }else {
               map6.put(word6,1);
                System.out.println("The new " + word6+ " is added");
            }
        }
        System.out.println(map6);


    }
}


