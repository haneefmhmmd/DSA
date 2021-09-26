package com.company;

import java.util.Arrays;

/*
* Time Complexity is O(n^2) but the number of swaps is just one in each iteration so, it will be O(n)
* whereas in bubble sort it is O(n^2), therefore it is faster compared to bubble sort.
* */


public class SelectionSort {
    public static int[] sort(int[] array){
        int min;
        for (int i=0 ; i< array.length-1; i++){
            min = i;
            for(int j = i+1; j< array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            swap(i,min,array);
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
        int[] sortedNumbers;

        sortedNumbers = sort(randomNumbers); // bubble sort

        // print out the sorted numbers
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
