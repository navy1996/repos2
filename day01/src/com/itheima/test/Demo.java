package com.itheima.test;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,9,4,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int a = 4;
        int i = biSearch(arr, a);
        System.out.println(i);
    }

    public static int biSearch(int[] arr, int a) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid = 0;
        while (startIndex < endIndex) {
            mid = (startIndex + endIndex) / 2;
            if (arr[mid] == a) {
                return mid;
            } else if (arr[mid] < a) {
                endIndex = mid;
            } else {
                startIndex = mid;
            }
        }
        return -1;
    }
}