package com.tutorial;

public class MyClass4 {
    static int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        //return values
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
