package com.google.ezlotnikova.homework1_2.cars;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static List<Car> createRandomCars(int amount) {
        List<Car> cars = new ArrayList<>();
                for (int i = 0; i < amount; i++) {
            cars.add(createRandomCar("Car" + (i+1)));
        }
    return cars;
    }

    public static Car createRandomCar(String name) {
        return new Car(name, Model.values()[Util.getRandomInt(0, 2)],
                Util.getRandomInt(1, 3));
    }

}
