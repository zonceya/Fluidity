package com.example.fluidityassesment;

public abstract class AbstractVehicle implements Vehicle {
    protected int cargoSpace;
    protected int vehicleType;

    public AbstractVehicle(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    protected int getMaxCargoCapacity() {
        switch (vehicleType) {
            case 0: // Car
            case 1: // Electric car
                return 500;
            case 2: // Truck
                return 18000;
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}