package com.example.inheritance.polymorhism;

public class Holden extends Car {


    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return "Holden Engine is Starting";
    }

    @Override
    public String accelerate() {
        return "Holden Engine is accelerating";
    }

    @Override
    public String brake() {
        return "Holden Engine is braking";
    }
}
