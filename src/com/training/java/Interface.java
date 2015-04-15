package com.training.java;

/**
 * Created by ktaro on 2015/04/15.
 */

interface InterA {
    String get(String a);

    /* Error!
    String Same();
    */
}

interface InterB {
    Integer get(Integer b);

    /* Error!
    Integer Same();
    */
}

class Interface implements InterA, InterB{
    @Override
    public String get(String a){
        return "InterFace!";
    }

    @Override
    public Integer get(Integer b) {
        return 1;
    }

    /* Error!
    * 異なる返り値の同名メソッドのためオーバーライドできない
    @Override
    public String Same(){
        return "hoge";
    }

    @Override
    public Integer Same(){
       return 1;
    }
    */
}

class InterFaceMain extends Interface {
    public static void main(String[] args) {
        InterA a = new Interface();
        System.out.println(a.get("a"));

        InterB b = new Interface();
        System.out.println(b.get(1));
    }
}
