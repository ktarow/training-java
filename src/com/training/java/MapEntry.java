package com.training.java;

import java.util.*;

/**
 * Created by ktaro on 2015/04/17.
 */
public class MapEntry {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("hoge", 1);
        map.put("fuga", 2);

        for(String str : map.keySet()) {
            System.out.println(str);
        }

        //java8
        map.keySet().forEach(s -> System.out.println(s));

        for(Integer i : map.values()) {
            System.out.println(i);
        }

        //java8
        map.values().forEach(s -> System.out.println(s));

        for(Iterator<String> i = map.keySet().iterator(); i.hasNext();) {
            String str = i.next();
            System.out.println(str);
        }

        for(Iterator<Integer> i = map.values().iterator(); i.hasNext();) {
            int in = i.next();
            System.out.println(in);
        }

        for(Map.Entry<String,Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }

        for(Iterator<Map.Entry<String,Integer>> i = map.entrySet().iterator(); i.hasNext();) {
            Map.Entry<String,Integer> m = i.next();
            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }
}
