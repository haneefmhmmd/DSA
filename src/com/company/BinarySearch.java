package com.company;

public class BinarySearch {

    public static int search(int[] array, int key, int start, int end){

        if(start <= end){
            int middle = start + (end-start)/2;
            if(array[middle] == key){
                return middle;
            }else if(array[middle] > key){
                end = middle -1;
            }else {
                start = middle + 1;
            }
        }else {
            return -1;
        }
        return search(array,key,start,end);
    }

    public static void main(String[] args) {
        int[] randomNumbers = {0, 1, 5, 13, 23, 32, 123, 352, 2351, 3242, 3915};
        System.out.println(search(randomNumbers,07,0,randomNumbers.length-1));
    }
}
