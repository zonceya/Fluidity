package com.example.fluidityassesment;

public class ElectricCar extends Car {
    public ElectricCar() {
        super(1); // Electric car type
    }
    @Override
    public void drive() {
        System.out.println("Electric Car is driving ...");
    }
    @Override
    public void printStats() {
        System.out.println("Electric Car statistics:");
        System.out.println("Cargo space: " + cargoSpace + " kgs");
    }
}