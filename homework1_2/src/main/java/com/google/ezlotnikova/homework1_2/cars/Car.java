package com.google.ezlotnikova.homework1_2.cars;

public class Car {

    private final String name;
    private final Model model;
    private final int engineCapacity;

    public String getName() {
        return name;
    }

    public Model getModel() {
        return model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public Car(String name, Model model, int engineCapacity) {
        this.name = name;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

}
