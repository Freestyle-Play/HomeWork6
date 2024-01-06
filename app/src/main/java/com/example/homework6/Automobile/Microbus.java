package com.example.homework6.Automobile;

public class Microbus implements Automobile{
    private int passengerCapacity;
    private int maxSpeed;
    private float weight;

    public Microbus(){
        passengerCapacity = 8;
        maxSpeed = 180;
        weight = 1.6f;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
