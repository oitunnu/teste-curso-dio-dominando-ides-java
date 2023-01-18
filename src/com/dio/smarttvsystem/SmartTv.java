package com.dio.smarttvsystem;

public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 20;

    // method to turn TV on
    public void turnOn(){
        on = true;
    }
    
    // method to turn TV off
    public void turnOff(){
        on = false;
    }

    // method to increase TV volume
    public void increaseVolume(){
        volume++;
    }

    // method to reduce TV volume
    public void reduceVolume(){
        volume--;
    }

    // methods to change TV channel
    public void goUpChannel(){
        channel++;
    }
   
    public void goDownChannel(){
        channel--;
    }
    
    public void changeChannel(int newChannel){
        channel = newChannel;
    }
}
