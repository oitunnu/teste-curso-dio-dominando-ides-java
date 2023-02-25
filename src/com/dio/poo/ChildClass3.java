package com.dio.poo;

public class ChildClass3 {
    
    ParentClass parentClass1;

    void method() {
        // attributes from parent class that are not private
        String example1 = parentClass1.attribute2;

        // method from parent class not private
        parentClass1.method4();
    }
}
