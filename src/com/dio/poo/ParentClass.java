package com.dio.poo;

public class ParentClass {
    // attributes
    private String attribute1;

    protected String attribute2;

    public String attribute3; // can be seen outside of package

    void method1() {
        System.out.println("Parent class' method 1");
    }
    
    void method2() {
        System.out.println("Parent class' method 2");
    }

    private void method3() {
        System.out.println("Method 3 of Child class 1");
    }
    
    protected void method4() {
        System.out.println("Method 4 of Child class 1");
    }
    
    public void method5() {
        System.out.println("Method 5 of Child class 1");
    }
}
