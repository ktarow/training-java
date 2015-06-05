package com.training.java;

/**
 * Created by ktaro on 2015/06/05.
 */
public class StaticExtendParrent {
    static String field = "parrent";

    static String getMethod() {
        return "parrent method";
    }

    static class StaticNestClass {
        private String str = "StaticNestClass";

        public String getStr() {
           return str;
        }
    }

    public static void main(String[] args) {
        StaticExtendParrent.StaticNestClass sep = new StaticExtendParrent.StaticNestClass();
    }
}
