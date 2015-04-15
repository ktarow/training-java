package com.training.java;

import java.util.*;

/**
 * Created by ktaro on 2015/04/12.
 */
public class Lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Groovy", "Java", "Scala");
        list.sort((String s1, String s2) -> s1.length() - s2.length());
        System.out.println(list);
    }
}
