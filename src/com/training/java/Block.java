package com.training.java;

/**
 * Created by ktaro on 2015/06/05.
 */
class E {
    {
        String str = "instans block";
        System.out.println(str);
    }

    static {
        String str = "class block";
        System.out.println(str);
    }
}

public class Block extends E {
    public static void main(String[] args) {
        //E e = new E();
    }
}
