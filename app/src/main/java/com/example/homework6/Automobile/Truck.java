package com.example.homework6.Automobile;

public class Truck implements Automobile{
    private int passengerCapacity;
    private int maxSpeed;
    private float weight;

    public Truck(){
        passengerCapacity = 3;
        maxSpeed = 170;
        weight = 3f;
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
