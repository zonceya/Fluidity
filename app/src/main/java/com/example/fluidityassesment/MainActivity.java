package com.example.fluidityassesment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Car car = new Car(0); // Assuming 0 represents a car type

        // Use car methods
        car.drive();
        car.addCargo(200);
        car.fillUpFuel();
        car.printStats();
        car.changeOil();

        // Create an ElectricCar instance
        ElectricCar electricCar = new ElectricCar();

        // Use electric car methods
        electricCar.drive();
        electricCar.addCargo(100); // Example cargo weight
        electricCar.printStats();
        // You can also call additional methods specific to the ElectricCar class here

        // Create a Truck instance
        Truck truck = new Truck();

        // Use truck methods
        truck.drive();
        truck.addCargo(5000); // Example cargo weight
        truck.fillUpFuel();
        truck.printStats();
        truck.changeOil();
    }
}