package com.company;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int[] array, int start, int end){

        int pivot, patitionPoint = start,i;
        pivot = array[end];
        for(i = start; i<end;i++){
            if(array[i] < pivot){
                swap(patitionPoint, i, array);
                patitionPoint++;
            }
        }
        swap(patitionPoint, end, array);
        return  patitionPoint;
    }

    public static void sort(int[] array, int start,int end){
        if(start < end){
            int p = partition(array,start,end);
            sort(array,start,p-1);
            sort(array,p+1,end);
        }

    }

    public static void main(String[] args) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
        sort(randomNumbers,0,randomNumbers.length-1);
        // print out the sorted numbers
        System.out.println(Arrays.toString(randomNumbers));
    }
}
