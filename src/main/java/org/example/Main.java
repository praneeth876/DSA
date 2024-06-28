package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int fullArr[]={3,2,4,7,10,6,5};
       // System.out.println(totalArr(fullArr));
        for (int num : totalArr(fullArr)){
            System.out.println(num);
        }

    }
    public static int[] totalArr(int[] arr){
        List<Integer> list=new ArrayList<>();

    for (int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
        // oddArr[i]=arr[i];
list.add(arr[i]);
        }
    }
        //System.out.println(list.size());
        int[] oddArr = new int[list.size()];
    for(int i=0;i<list.size();i++){
        oddArr[i]= list.get(i);
    }
return oddArr;
    }
}