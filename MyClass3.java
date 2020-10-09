package com.tutorial;

public class MyClass3 {
    static void myMethod(String fname, int age){
      System.out.println(fname + " is " + age);
    }
    public static void main(String[] args){
        //multiple parameter
     myMethod("liam", 5);
     myMethod("jenny", 8);
     myMethod("anja", 31);
    }

}
