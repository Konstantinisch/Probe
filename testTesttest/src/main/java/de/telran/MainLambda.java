package de.telran;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainLambda {
    public static void main(String[] args) {
        Function<Integer, String> opInt1 = (value) -> "Our Number ->" + Integer.toString(value);
        System.out.println(opInt1.apply(6589));

        Function<String, Integer> opStr = st -> Integer.parseInt(st);
        System.out.println((opStr.apply("9874")) - 5);

        Function<String, Integer> op = str -> Integer.parseInt(str);
        System.out.println((op.apply("256") + 3));

        //2. Ссылки на методы
        op = MainLambda::parse;
        //System.out.println(op);
        System.out.println("Something new ---- " + op.apply("57"));

        Function<Integer, String> opInt = (val) -> "Наше число -> " + (val);
        System.out.println(opInt.apply(7654332));

        opInt = opInt.andThen(String::toUpperCase);
        System.out.println(opInt.apply(777));

        opInt = opInt.andThen(String::toUpperCase).andThen(String::toLowerCase);
        System.out.println(opInt.apply(12345));

        BiFunction<Integer, Integer, Integer> fun = (x, y) -> x + y;
        System.out.println(fun.apply(2, 2));

        Predicate<Integer> pred = (r) -> r > 0;
        System.out.println(pred.test(-2));

        Comparator<Integer> compar = ((o1, o2) -> o1 - o2);
        Set<Integer> set1 = new TreeSet<>(compar);
        set1.add(6);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(0);
        set1.add(9);
        System.out.println(set1);

        List<Integer> list = new ArrayList<>(List.of(2, 5, 7, 43, 87, 53, 1));
        Comparator<Integer> comparator = (o1, o2) -> o2.compareTo(o1);
        list.sort(comparator);
        System.out.println(list);

        comparator = Integer::compareTo;
        list.sort(comparator);
        System.out.println(list);


//        Comparator<Integer> comparatorLambda = ((o1, o2) -> o2 - o1);
//        Set<Integer> set = new TreeSet<>(comparatorLambda);
//        set.add(5);
//        set.add(8);
//        set.add(1);
//        set.add(19);
//        set.add(3);
//        System.out.println(set);


        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(5);
        consumer = (t) -> {
            if (t > 30)
                System.out.println("The weather is Hot.");
            else if (t < 2)
                System.out.println("The weather is cold.");
            else if (t >= 2 && t <= 30)
                System.out.println("The weather is good!");
        };
        consumer.accept(7);

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int fac = scan.nextInt();
        int x = 1;
        for (int i = 1; i <= fac; i++) {
            x *= i;
        }
        System.out.println("Factorial of number " + fac + " is " +x);

        Map<String, Integer> map = new HashMap();
        map.put("Banana",5);
        map.put( "Orange",6);
        map.put( "Mandarin",7);
        map.put( "Apple",7);
        map.put( "Kiwi",4);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
        }
        System.out.println(map);




    }

    static Integer parse(String str) {
        return Integer.parseInt(str) + 5;
    }


}
