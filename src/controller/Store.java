package controller;

import model.Car;

public class Store {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car a = new Car();

        a.setBrand("Ford");
        a.setModel("Focus");
        a.setType("Hatchback");

        System.out.println("Brand: " + a.getBrand() + " Model: " + a.getModel() + " Type: " + a.getType());

        Car b = a.clone();

        System.out.println("Brand: " + a.getBrand());

        b.setModel("Mustang");
        System.out.println("Brand: " + a.getBrand() + " Model: " + a.getModel() + " Type: " + a.getType());
    }
}
