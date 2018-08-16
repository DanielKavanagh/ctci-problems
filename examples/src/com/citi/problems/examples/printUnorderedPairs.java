package com.citi.problems.examples;

import java.util.Random;

public class printUnorderedPairs {
    static void printUnorderedPairs(int[] array) {
        for (int i=0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int count = 100;
        int[] arrayRandom = new int[count];
        int[] arrayOrdered = {
                1, 2, 3, 4, 5, 6, 7
        };

        for (int i=0; i < count; i++) {
            arrayRandom[i] = rand.nextInt(1000) + 1;
        }

        printUnorderedPairs(arrayRandom);
        printUnorderedPairs(arrayOrdered);
    }
}
