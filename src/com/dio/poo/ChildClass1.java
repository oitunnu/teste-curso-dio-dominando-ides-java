package com.dio.poo;

public class ChildClass1 extends ParentClass{
    
    // method from Parent class
    @Override
    void method1() {
        System.out.println("Method 1 of Child class 1");
    }

    // method of child class
    void method() {
        System.out.println("Method 3 of Child class 1");
    }
    
}
