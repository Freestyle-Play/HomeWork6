package com.example.homework6.Automobile;

public class Car implements Automobile{
    private int passengerCapacity;
    private int maxSpeed;
    private float weight;

    public Car() {
        this.passengerCapacity = 5;
        this.maxSpeed = 210;
        this.weight = 1.2F;
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
