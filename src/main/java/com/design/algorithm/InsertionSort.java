package com.design.algorithm;

public class InsertionSort {
    public void sort(int[] array) {
        for (int fui = 1; fui < array.length - 1; fui++) {
            int element = array[fui];
            int i;

            for (i = fui; i > 0 && array[i-1]> element; i--)
                array[i] = array[i-1];

            array[i] = element;
        }
    }

}
