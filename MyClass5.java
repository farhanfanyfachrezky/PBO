package com.tutorial;

public class MyClass5 {
static void checkAge(int age){
    if (age < 18) {
        System.out.println("Acces denied - you're not pld enough!");
    }else{
        System.out.println("access granted - you're old enough!");
    }
}
    public static void main(String[] args){
    //A Method with if...else
    checkAge(15);
    }
}
