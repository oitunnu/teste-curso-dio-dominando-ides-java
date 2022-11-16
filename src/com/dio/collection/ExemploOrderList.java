package com.dio.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrderList {
    public static void main(String[] args) {
        // create a list with cat's names
        List<Gato> myCats = new ArrayList<>(){{
            add(new Gato("Joan", 5, "black"));
            add(new Gato("Anne", 7, "orange"));
            add(new Gato("Billy", 2, "tabby"));
        }};

        System.out.println("--\tOrder of Insertion\t---");
        System.out.println(myCats);
        
        System.out.println("--\tRandom Order\t---");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\tNatural Order\t---");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("--\tAge Order\t---");
//        Collections.sort(myCats, new ComparatorAge());
        myCats.sort(new ComparatorAge());
        System.out.println(myCats);

        System.out.println("--\tColour Order\t---");
        Collections.sort(myCats, new ComparatorColour());
//        myCats.sort(new ComparatorColour());
        System.out.println(myCats);

        System.out.println("--\tName/Colour/Age Order\t---");
        Collections.sort(myCats, new ComparatorNameColourAge());
//        myCats.sort(new ComparatorNameColourAge());
        System.out.println(myCats);


    }
    
        
}

// new class using comparable interface
class Gato implements Comparable<Gato>{
    private String name;
    private Integer age;
    private String colour;
    
    public Gato(String name, Integer age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", colour=" + colour + "]";
    }

    // comparing cats name; if it returns 0, it's the same cat
    @Override
    public int compareTo(Gato gato) {
        return this.getName().compareToIgnoreCase(gato.getName());
    }    
}

class ComparatorAge implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getAge(), g2.getAge());
    }
    
}

class ComparatorColour implements Comparator<Gato> {
    // if g1 bigger than g2, then it returns 1
    // if g1 smaller, then it returns negative number
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getColour().compareToIgnoreCase(g2.getColour());
    }
    
}

class ComparatorNameColourAge implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int name = g1.getName().compareToIgnoreCase(g2.getName());
        if(name != 0) return name;

        int colour = g1.getColour().compareToIgnoreCase(g2.getColour());
        if(colour != 0) return colour;

        return Integer.compare(g1.getAge(), g2.getAge());
    }
    
}