package com.google.ezlotnikova.homework1_2.cars;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        int carsListCapacity = 10;
        List<Car> cars = CarFactory.createRandomCars(carsListCapacity);
        Map<Integer, List<Car>> carMap = sortByEngineCapacity(cars);

        int randomCapacity = Util.getRandomInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        List<Car> randomList = carMap.get(randomCapacity);
        if (randomList != null) {
            String filename = Util.getPath(MethodHandles.lookup().lookupClass()) + "cars.txt";
            printToFile(randomList, filename);
        } else {
            logger.warn("Cars with engine capacity " + randomCapacity + " not found");
        }
    }

    private static Map<Integer, List<Car>> sortByEngineCapacity(List<Car> cars) {
        Map<Integer, List<Car>> carMap = new HashMap<>();
        for (Car car : cars) {
            int engineCapacity = car.getEngineCapacity();
            if (carMap.containsKey(engineCapacity)) {
                carMap.get(engineCapacity).add(car);
            } else {
                List<Car> list = new ArrayList<>();
                list.add(car);
                carMap.put(engineCapacity, list);
            }
        }
        return carMap;
    }

    private static void printToFile(List<Car> cars, String filename) {
        try (PrintWriter out = new PrintWriter(
                new FileWriter(filename))
        ) {
            for (Car car : cars) {
                out.printf("<%s>:<%s>:%s", car.getName(), car.getModel(), car.getEngineCapacity());
                out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
