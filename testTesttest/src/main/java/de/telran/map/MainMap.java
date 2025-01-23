package de.telran.map;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> mapp = new HashMap<>();
        mapp.put("Banana", 5);
        mapp.put("Orange", 2);
        mapp.put("Mandarin", 6);
        mapp.put("Apple", 9);
        mapp.put("Kiwi", 6);
        System.out.println(mapp);

        Map<String, Integer> mapp1 = new LinkedHashMap<>();
        mapp1.put("Banana", 5);
        mapp1.put("Orange", 2);
        mapp1.put("Mandarin", 6);
        mapp1.put("Apple", 9);
        mapp1.put("Kiwi", 6);
        for (Map.Entry<String, Integer> entry : mapp1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
        }
        System.out.println(mapp1);

        Map<String, Integer> mapp2 = new TreeMap<>();
        mapp2.put("Banana", 5);
        mapp2.put("Orange", 2);
        mapp2.put("Mandarin", 6);
        mapp2.put("Apple", 9);
        mapp2.put("Kiwi", 6);
        System.out.println(mapp2);

        System.out.println();

        Map<Integer, String> mapp3 = new TreeMap<>();
        mapp3.put(5, "Banana");
        mapp3.put(4, "Orange");
        mapp3.put(7, "Mandarin");
        mapp3.put(2, "Apple");
        mapp3.put(9, "Kiwi");
        for (Map.Entry<Integer, String> entry : mapp3.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (value.equals("Apple"))
                System.out.println("Key: " + key + ", Value: " + value);
        }
        System.out.println(mapp3);

        TreeMap<Integer, String> mapp4 = new TreeMap<>();
        mapp4.put(5, "Banana");
        mapp4.put(4, "Orange");
        mapp4.put(7, "Mandarin");
        for (Map.Entry<Integer, String> entry : mapp4.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);

        }


        System.out.println();


        List<String> arr = new ArrayList<>();
        arr.add("Potate");
        arr.add("Tikva");
        arr.add("Ogurez");
        for (String ovos : arr) {
            System.out.println(ovos.isEmpty());
        }
        System.out.println(arr);

        Map<String, Integer> map = new HashMap<>();
        map.put("YYY",1);
        map.put("RRR",2);
        map.put("OOO",1);
        map.put("NNN",6);
        for (Map.Entry<String,Integer> map5 : map.entrySet()){
            String key = map5.getKey();
            Integer value = map5.getValue();
        }
        map.put("ALl", 12);
        map.putAll(mapp2);
        System.out.println(map.keySet());
        System.out.println(map.containsValue(2));
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
        }

    }
}
