package com.training.java;

import java.util.List;
import java.util.Arrays;

/**
 * Created by ktaro on 2015/04/17.
 */
public class Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "xyz", "defghi", "a");

        list.stream()
                .filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}