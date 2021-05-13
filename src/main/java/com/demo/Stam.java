package com.demo;

import scala.Tuple2;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class Stam {


    public static void abc(){

    }





    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {





        int x = JavaMathFunctions.minus(2, 4);
        int y = ScalaMathFunctions.minus(2, 4);


        Tuple2<String, Integer> tuple2 = new Tuple2<>("java", 11);
        String key = tuple2._1();
        Integer value = tuple2._2();
        System.out.println("key = " + key);
        System.out.println("value = " + value);
    }
}
