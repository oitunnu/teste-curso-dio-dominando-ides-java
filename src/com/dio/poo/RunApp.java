package com.dio.poo;

public class RunApp {
    public static void main(String[] args) {
        ParentClass[] classes = new ParentClass[]{new ChildClass1(), new ChildClass2(), new ParentClass()};

        for (ParentClass class1 : classes) {
            class1.method1();
        }

        System.out.println("");

        for (ParentClass class1 : classes) {
            class1.method2();
        }

        System.out.println("");

        ChildClass2 childClass2 = new ChildClass2();
        childClass2.method2();
    }
}
