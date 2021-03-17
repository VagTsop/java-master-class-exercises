package com.example.inheritance.polymorhism;

public class Mitsubishi extends Car {


    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return "Mitsubishi Engine is Starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi Engine is accelartng";
    }

    @Override
    public String brake() {
        return "Mitsubishi Engine is braking";
    }
}
