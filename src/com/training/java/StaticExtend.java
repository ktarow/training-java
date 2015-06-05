package com.training.java;

public class StaticExtend extends StaticExtendParrent{
    /*
    static String field = "child" ;

    static String getMethod() {
        return "child method";
    }
    */

    public static void main(String[] args) {

        System.out.println(StaticExtend.field);
        System.out.println(StaticExtend.getMethod());

        System.out.println(StaticExtendParrent.field);
        System.out.println(StaticExtendParrent.getMethod());

        StaticExtendParrent sep = new StaticExtendParrent();
        // オブジェクトからクラスメソッドを呼び出す 普通やらない
        String str = sep.getMethod();
        System.out.println("Static : " + str);

        StaticExtend.StaticNestClass se = new StaticExtend.StaticNestClass();
        System.out.println(se.getStr());
    }
}
