package com.design.algorithm;

public class BubbleSort {
    public void sort(int[] array) {
        for (int lui = array.length - 1; lui > 0; lui--) {
            for (int i = 0; i < lui; i++)
                if (array[i] > array[i + 1])
                    this.swap(array, i, i + 1);
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
