package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[25];
//      int[] myIntArray =  {1,2,3,4,5,6,7,8,9,10};
        myIntArray[0] = 45;
        double[] myDoubleArray = new double[10];
        printArray(myIntArray);
        Arrays.setAll(myIntArray, i -> i * 10);
        printArray(myIntArray);
/*
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
*/
    }

    public static void printArray(int[] array) {
        IntStream.range(0, array.length).forEach(i -> System.out.println("Element " + i + ", value is " + array[i]));
/*
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
*/
    }
}
