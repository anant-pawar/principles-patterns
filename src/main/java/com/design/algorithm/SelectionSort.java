package com.design.algorithm;

public class SelectionSort {
    public void sort(int[] array) {
        for (int lui = array.length - 1; lui > 0; lui--) {
            int largest = 0;

            for (int i = 0; i <= lui; i++)
                if (array[i] > array[largest])
                    largest = i;

            this.swap(array, largest, lui);
        }
    }

    public void swap(int[] array, int i, int j) {
        if (i == j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
