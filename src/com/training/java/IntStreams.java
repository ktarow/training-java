package com.training.java;

import java.util.stream.*;
import java.util.Arrays;

/**
 * Created by ktaro on 2015/04/18.
 */
public class IntStreams {
    public static void main(String[] args) {
        //IntStreamのファクトリメソッドを利用する

        //n以上m未満
        int[] arr = IntStream.range(0, 10).toArray();
        Arrays.stream(arr).forEach(i -> System.out.print(i));

        //n以上m以下
        int[] arr2  = IntStream.rangeClosed(0, 10).toArray();
        Arrays.stream(arr2).forEach(i -> System.out.print(i));
    }
}
