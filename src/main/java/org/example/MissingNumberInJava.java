package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MissingNumberInJava {
    public static void main(String[] args) {
        int[] arr={8,2,6,3,4,9,1,11};
        // System.out.println("Minimum number is : "+findMin(arr));
        System.out.println(missingNumber(arr));
    }
    public static List<Integer> missingNumber(int[] arr){
        int missNum[]=null;
        int[] arr1=arr;
        Arrays.sort(arr);
        //System.out.println(arr[arr.length-1]-1);
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i<arr[arr.length-1]-1; i++) {

             int count=0;
            //System.out.println(arr.length-1);
            for (int j=0;j<arr1.length-1;j++) {
                //System.out.println("j");
if(i==arr[j]){
    //System.out.println(i);
    count++;
    break;
}
            }
            if(count==0){
                System.out.println(i);
                list.add(i);
            }
        }
        return list;
    }

}
