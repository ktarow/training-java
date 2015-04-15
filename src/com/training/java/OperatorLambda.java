package com.training.java;

/**
 * Created by ktaro on 2015/04/16.
 */
public class OperatorLambda {
    @FunctionalInterface
    interface Operator {
        int operator(Integer x, Integer y);
    }

    public static void main(String[] args) {
        Operator o1 = (Integer x, Integer y) -> x + y;
        Operator o2 = (Integer x, Integer y) -> x - y;
        Operator o3 = (Integer x, Integer y) -> x * y;
        Operator o4 = (Integer x, Integer y) -> x / y;

        System.out.println(o1.operator(10,5));
        System.out.println(o2.operator(10,5));
        System.out.println(o3.operator(10,5));
        System.out.println(o4.operator(10,5));

    }
}
