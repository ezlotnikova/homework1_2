package com.google.ezlotnikova.homework1_2;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task2 {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        int arraySize = 10;
        int arrayValueLowLimit = -300;
        int arrayValueUpperLimit = 300;

        int[] array = createArray(arraySize, arrayValueLowLimit, arrayValueUpperLimit);
        int minValue = getMinValue(array);
        int maxValue = getMaxValue(array);
        int maxElementIndex = getMaxElementIndex(array);

        array[maxElementIndex] = minValue * maxValue;

        logger.error(Arrays.toString(array));
    }

    private static int[] createArray(int arraySize, int arrayValueLowLimit, int arrayValueUpperLimit) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayValueLowLimit + (int) (Math.random() * (arrayValueUpperLimit - arrayValueLowLimit + 1));
        }
        return array;
    }

    private static int getMinValue(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    //    private static int getMinElementIndex(int[] array) {
    //        int minValue = Integer.MAX_VALUE;
    //        int minElementIndex = -1;
    //        for (int i = 0; i < array.length; i++) {
    //            if (array[i] < minValue) {
    //                minValue = array[i];
    //                minElementIndex = i;
    //            }
    //        }
    //        return minElementIndex;
    //    }

    private static int getMaxValue(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    private static int getMaxElementIndex(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        int maxElementIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

}
