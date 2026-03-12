package com.Assignment_3.module_7;
class RotatedArraySearch {

    static int search(int arr[], int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key)
                return mid;

            // Left half sorted
            if (arr[left] <= arr[mid]) {
                if (key >= arr[left] && key < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            // Right half sorted
            else {
                if (key > arr[mid] && key <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {6,7,8,1,2,3,4,5};
        int key = 3;

        int result = search(arr, key);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}