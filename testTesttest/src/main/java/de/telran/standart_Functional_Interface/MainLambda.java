package de.telran.standart_Functional_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainLambda {
    public static void main(String[] args) {
//        BiFunction<Double, Double, Double> functionDiv = (r,t) ->  r/t;
//        System.out.println("Our division = "+functionDiv.apply(45.6,4.8));
//
//        BiFunction<Double, Double, Double> functionMult = (e,w) -> w*e;
//        System.out.println("Our multiplication = "+functionMult.apply(9.5,4.8));

//        BiFunction<Integer, Integer, Integer> functionMin =(a,b)->a-b;
//        System.out.println("Your result of Minus = "+functionMin.apply(5647,1));

        Function<Integer,Integer> functionCub = (r)-> r*r*r;
        System.out.println("Our Cub = "+functionCub.apply(3));

//        Consumer <Integer> consumerD = (t)-> System.out.println("Our temperatur is "+t);
//        consumerD.accept(10);
//        consumerD = (temp)->{
//            if (temp > 29) System.out.println("It's very hot outside.");
//            else if (temp < 15 && temp >=0) System.out.println("It's pretty cool.");
//            else if (temp < 0) System.out.println("It's cold");
//            else System.out.println("It's normal.");
//        };
//        consumerD.accept(-4);


//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        integers.forEach(item -> System.out.println(item));

//
//        List<String> colors = Arrays.asList("Black", "White", "Red");
//        Collections.sort(colors, (o1, o2) -> {
//            String o1LastLetter = o1.substring(o1.length() - 1);
//            String o2LastLetter = o2.substring(o2.length() - 1);
//            return o1LastLetter.compareTo(o2LastLetter);
//        });


    }
}
