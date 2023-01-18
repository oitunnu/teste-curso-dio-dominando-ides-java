package com.dio.smarttvsystem;

public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        //checking status
        System.out.println("Is the TV on? " + smartTv.on);
        System.out.println("Current channel: " + smartTv.channel);
        System.out.println("Volume is: " + smartTv.volume);

        //turn TV on
        smartTv.turnOn();
        System.out.println("New TV status -> Is the TV on? " + smartTv.on);
        
        //turn TV off
        smartTv.turnOff();
        System.out.println("New TV status -> Is the TV on? " + smartTv.on);
        
        //increase volume
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        System.out.println("Volume is: " + smartTv.volume);
        
        //reduce volume
        smartTv.reduceVolume();
        System.out.println("Volume is: " + smartTv.volume);
        
        //change channel with parameter
        smartTv.changeChannel(15);
        System.out.println("New channel is: " + smartTv.channel);
    }
}
