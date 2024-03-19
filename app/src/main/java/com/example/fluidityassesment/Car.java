package com.example.fluidityassesment;

public class Car extends AbstractVehicle {

    public Car(int vehicleType) {
        super(vehicleType);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving up...");
    }

    @Override
    public void addCargo(int kgs) {
        if (kgs > getMaxCargoCapacity()) {
            throw new IllegalArgumentException("Cargo exceeds capacity");
        }
        this.cargoSpace = kgs;
    }

    @Override
    public void fillUpFuel() {
        System.out.println("Car is filling up...");
    }

    @Override
    public void printStats() {
        System.out.println("Car statistics:");

        System.out.println("Cargo space: " + cargoSpace + " kgs");
    }

    @Override
    public void changeOil() {
        System.out.println("Truck is changing Oil...");
    }

}
