package com.dio.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        // create a hashset; create a grade list
        Set<Double> grades = new HashSet<>(Arrays.asList(7d, 8.5, 9d, 5.3, 0d, 3.6));
        System.out.println(grades.toString());

        Iterator<Double> iterator = grades.iterator();
        Double sum = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }
        System.out.println("The total sum is: " + sum);
        System.out.println("The average is: " + sum/grades.size());
        System.out.println("Remove grade 0: " );
        grades.remove(0d);

        System.out.println("Remove grades smaller than 7: " );
        Iterator<Double> iterator1 = grades.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(grades);

        // show list in order of insertion
        Set<Double> grades2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9d, 5.3, 0d, 3.6));
        System.out.println(grades2);

        // show list in ascending order
        Set<Double> grades3 = new TreeSet<>(grades2); // this works because of comparable/comparator
        System.out.println(grades3);

        //System.out.println("Erase list");
        //grades.clear();

    }
}
