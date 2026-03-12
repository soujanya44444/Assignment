package com.Assignment_3.module_7;
public class BinarySearch {

    public static int search(int[] arr, int key){

        int l = 0, r = arr.length-1;

        while(l <= r){

            int mid = (l+r)/2;

            if(arr[mid] == key)
                return mid;

            if(arr[mid] < key)
                l = mid+1;
            else
                r = mid-1;
        }

        return -1;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        System.out.println(search(arr,4));
    }
}