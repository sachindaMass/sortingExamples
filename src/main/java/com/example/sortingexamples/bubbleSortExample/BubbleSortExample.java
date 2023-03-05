package com.example.sortingexamples.bubbleSortExample;

public class BubbleSortExample {

    public void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void bubbleSort(int[] numbers) {
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }
}
