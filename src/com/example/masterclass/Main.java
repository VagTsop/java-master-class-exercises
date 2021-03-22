package com.example.masterclass;

public class Main {


    public static void main(String args[]) {

      Car porsche = new Car();
      Car holden = new Car();
     // porsche.model = "Carrera"; --> bad practise -> use getter or setter
        System.out.println("Model is " + porsche.getModel()); //null --> default state of String

        porsche.setModel("911");
       System.out.println("Model is " + porsche.getModel());

    }
}
