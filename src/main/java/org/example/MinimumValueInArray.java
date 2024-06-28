package org.example;

import java.util.Arrays;

public class MinimumValueInArray {
    public static void main(String[] args) {
        int[] arr={3,4,7,9,1,11};
       // System.out.println("Minimum number is : "+findMin(arr));
        System.out.println(findMinbyTempVariable(arr));
    }
    public static int findMin(int[] arr1){
        int arr[]=arr1;
        for (int i=0;i<arr.length-1;i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
return arr[0];
    }

    public static int findMinbyTempVariable(int[] arr1){
        int arr[]=arr1;
        int arr2[]= new int[arr.length];
        int num=arr1[0];
        for (int i=0;i<arr.length;i++) {

           // for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (num > arr[i]) {
                    num=arr[i];
            }

        }
        //System.out.println(num);
        return num;
    }
}
