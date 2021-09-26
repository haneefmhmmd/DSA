package com.company;

import java.util.*;

public class MergeSort {

    public static void mergeSortedArray(int[] lArray, int[] rArray, int [] array){
        int n1 = lArray.length;
        int n2 = rArray.length;
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if( lArray[i] < rArray[j]){
                array[k] = lArray[i];
                i++;
            }else{
                array[k] = rArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            array[k] = lArray[i];
            i++;
            k++;
        }
        while(j<n2){
            array[k] = rArray[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] array) {
        System.out.println("Array : "+Arrays.toString(array));
        int size = array.length;
        if(size < 2){
            return;
        }
        int middle = size/2;
        int[] lArray = new int[middle];
        int[] rArray = new int[size - middle];

        for(int i = 0; i< lArray.length;i++){
            lArray[i] = array[i];
        }
        for(int j = 0; j< rArray.length;j++){
            rArray[j] = array[middle+j];
        }
        sort(lArray);
        sort(rArray);
        mergeSortedArray(lArray,rArray,array);
    }

    public static void main(String[] args) {
        int[] randomNumbers = {1,2,-3,-4,5};

        sort(randomNumbers);
        // print out the sorted numbers
        System.out.println(Arrays.toString(randomNumbers));
    }
}
