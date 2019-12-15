package com.google.ezlotnikova.homework1_2.cars;

import java.io.File;

public class Util {

    public static int getRandomInt(int lowerLimit, int upperLimit) {

        return lowerLimit + (int) (Math.random() * (upperLimit - lowerLimit + 1));
    }

    public static String getPath(Class<?> clazz) {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "main" + File.separator+ "java" + File.separator;
        String subPath = clazz.getName().replace(clazz.getSimpleName(), "")
                .replace(".", File.separator);
        return path + subPath;
    }

}
