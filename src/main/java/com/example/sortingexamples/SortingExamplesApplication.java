package com.example.sortingexamples;

import com.example.sortingexamples.insertionSortExample.InsertionSortExample;
import com.example.sortingexamples.quickSortExample.QuickSortExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class SortingExamplesApplication {

    public static void main(String[] args) {

        SpringApplication.run(SortingExamplesApplication.class, args);

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        QuickSortExample quickSortExample = new QuickSortExample();

        System.out.println("Before: ");
        quickSortExample.printArray(numbers);

        quickSortExample.quicksort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter: ");
        quickSortExample.printArray(numbers);

//        --------------------------------------------------------------------------------------
        InsertionSortExample insertionSortExample = new InsertionSortExample();

        System.out.println("Before the insertion: ");
        insertionSortExample.printArray(numbers);

        insertionSortExample.InsertionSortExample(numbers);

        System.out.println("\nAfter the insertion: ");
        insertionSortExample.printArray(numbers);

//        ----------------------------------------------------------------------------------------
    }

}
