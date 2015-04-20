package com.training.java;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by ktaro on 2015/04/18.
 */
public class StreamReduce {
    public static void main(String[] args) {
        //直列処理用
        Stream<Integer> stm = Arrays.asList(30, 20, 40, 50).stream();

        //並列処理用
        Stream<Integer> stm2 = Arrays.asList(30, 20, 40, 50).parallelStream();

        System.out.println("--直列処理--");
        int min = stm.reduce(Integer.MAX_VALUE, (n1,n2) -> {
            System.out.println(n1);
            System.out.println(n2);
            return  Integer.min(n1,n2);
        });

        System.out.println("最小値 : " + min);

        System.out.println("--並列処理--");
        int min2 = stm2.reduce(Integer.MAX_VALUE, (n1,n2) -> {
            System.out.println(n1);
            System.out.println(n2);
            return Integer.min(n1,n2);
        });

        System.out.println("最小値 : " + min2);
    }
}
