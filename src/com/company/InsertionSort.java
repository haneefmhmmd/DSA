package com.company;

import java.util.Arrays;

/*
 First we assume that the first index is already sorted, so we start from 1th index,
 then we compare with the left index and see if its greater than element in current index,
 if not we shift the greater number to right pos and continue upto the left most element.
*/


public class InsertionSort {

    public static int[] sort(int[] array){
        int variable,i, j;
        for(i = 1; i< array.length;i++){
            variable = array[i];
            j = i;
            while(j>=1 && array[j-1] > variable){
                array[j] = array[j-1];
                j--;
            }
            array[j] = variable;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
        int[] sortedNumbers;

        sortedNumbers = sort(randomNumbers); // bubble sort

        // print out the sorted numbers
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
