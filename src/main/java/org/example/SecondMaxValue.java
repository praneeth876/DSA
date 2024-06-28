package org.example;

public class SecondMaxValue {
    public static void main(String[] args) {
        int[] arr={12,34,2,34,34,33,1};
        // System.out.println("Minimum number is : "+findMin(arr));
        System.out.println(findSecondMaxVal(arr));
    }
    public static int findSecondMaxVal(int[] arr1){
        int arr[]=arr1;
        int secondLar=0;
        for (int i=0;i<arr.length-1;i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=arr[i+1]){
                secondLar=arr[i+1];
                break;
            }
        }
        return secondLar;
    }
}
