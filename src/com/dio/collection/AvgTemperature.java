package com.dio.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AvgTemperature {
    public static void main(String[] args) {
        // get the average temperature of the first six months
        System.out.println("Enter the average temperature for these months: ");

        List<Temperature> avgTempSemester = new ArrayList<>(){{
            add(new Temperature("1 - January", 31f));
            add(new Temperature("2 - February", 32f));
            add(new Temperature("3 - March", 31f));
            add(new Temperature("4 - April", 31f));
            add(new Temperature("5 - May", 28f));
            add(new Temperature("6 - June", 28f));
        }};

        System.out.println(avgTempSemester);
        
        Float sum = 0f;

        for (Temperature temperature : avgTempSemester) {
            sum += temperature.getTemperature();
        }
        System.out.println(sum);

        // average temperature of the semester
        System.out.println("The average temperature of the semester is: " + sum/avgTempSemester.size());

        //Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //System.out.println("Enter January average temperature");

    }
}

class Temperature implements Comparable<Temperature>{
    private String month;
    private Float temperature;
    
    public Temperature(String month, Float temperature) {
        this.month = month;
        this.temperature = temperature;
    }

    public String getMonth() {
        return month;
    }

    public Float getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Temperature [month=" + month + ", temperature=" + temperature + "]";
    }

    @Override
    public int compareTo(Temperature temperature) {
        return this.getMonth().compareToIgnoreCase(temperature.getMonth());
    }
}

class ComparatorTemperature implements Comparator<Temperature> {
    @Override
    public int compare(Temperature t1, Temperature t2) {
        return Float.compare(t1.getTemperature(), t2.getTemperature());
    }
}