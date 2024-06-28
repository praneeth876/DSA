package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayByBothEnds {

    public static void main(String[] args) {

        //System.out.println("Hello world!");
        int fullArr[] = {3, 2, 4, 7, 10, 6, 5};
         System.out.println(Arrays.toString(totalArr(fullArr,0, fullArr.length-1)));
    }
    public static int[] totalArr(int[] arr, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
return  arr;
    }
}