package com.google.ezlotnikova.homework1_2;

import java.lang.invoke.MethodHandles;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task1 {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        Random rnd = new Random();
        int x = rnd.nextInt();
        int y = rnd.nextInt();
        int z = rnd.nextInt();
        if (x > z) {
            logger.debug("x + y = " + (x + y));
        } else {
            logger.debug("z = " + z);
        }
        double avg = (x + y + z) / 3.0;
        logger.info("avg = " + avg);
    }

}
