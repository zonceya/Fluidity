package com.example.fluidityassesment;

public class Truck extends AbstractVehicle {

    public Truck() {
        super(2); // Truck type
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving...");
    }

    @Override
    public void fillUpFuel() {
        System.out.println("Truck is filling up...");
    }

    @Override
    public void printStats() {
        System.out.println("Truck statistics:");
        System.out.println("Cargo space: " + cargoSpace + " kgs");
    }
    @Override
    public void addCargo ( int kgs){
        if (kgs > getMaxCargoCapacity()) {
            throw new IllegalArgumentException("Cargo exceeds capacity");
        }
        this.cargoSpace = kgs;
    }
    @Override
    public void changeOil() {
        System.out.println("Truck is changing Oil...");

    }
}