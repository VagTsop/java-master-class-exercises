package com.example.inheritance.polymorhism;

public class Ford extends Car {


    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return "Ford Engine is Starting";
    }

    @Override
    public String accelerate() {
        return "Ford Engine is accelerating";
    }

    @Override
    public String brake() {
        return "Ford Engine is braking";
    }
}
