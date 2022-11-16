package com.dio.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // creating a list
        List<Double> notas = new ArrayList<>();
        notas.add(5.6);
        notas.add(7.2);
        notas.add(9.1);
        notas.add(8.6);
        notas.add(5.4);
        notas.add(5.9);
        notas.add(7.6);

        System.out.println("Position of grade 7.2: " + notas.indexOf(7.2));
        
        // add grade 9.5 to list in position 5
        notas.add(5, 9.5);
        System.out.println(notas);

        // change grade 5.4 to 6.4
        notas.set(notas.indexOf(5.4), 6.4);
        System.out.println(notas);

        // check if grade 5.4 is on the list
        System.out.println(notas.contains(5.4));

        // show the sixth element (position 5)
        System.out.println("The sixth element is " + notas.get(5));

        // show the minimum element
        System.out.println("The minimum element is " + Collections.min(notas));
       
        // show maximum element
        System.out.println("The maximum element is " + Collections.max(notas));

        // sum all values
        Iterator<Double> iterator = notas.iterator();
        Double sum = 0d; 
        while (iterator.hasNext()) {
            Double next =  iterator.next();
            sum += next;
        }
        System.out.println("The sum is " + sum);

        // calculate average
        System.out.println("Average is " + (sum/notas.size()));

        // remove grade 5.6
        notas.remove(5.6);
        System.out.println(notas);

        // remove grade from position 1
        notas.remove(1);
        System.out.println(notas);

        // remove grades smaller than 7 and print list
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);
        
        // clear list
        notas.clear();
        System.out.println(notas);

        // verify if list is empty
        System.out.println("Is list empty? " + notas.isEmpty());
    }

    
}
