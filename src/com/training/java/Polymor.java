package com.training.java;

/**
 * Created by ktaro on 2015/04/14.
 */
class A {
    private int n;

    void setNum(int n) {
        this.n = n;
    }

    int getNum() {
        return this.n;
    }

}

class B extends A {
    String str;

    void setStr(String s) {
        this.str = s;
    }

}

public class Polymor {
    public static void main(String[] args) {
        A test = new B();
        test.setNum(10);
        System.out.println(test.getNum());

        // Error
        //System.out.println(test.setStr);
    }
}
