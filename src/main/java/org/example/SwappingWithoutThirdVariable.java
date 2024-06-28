package org.example;

public class SwappingWithoutThirdVariable {
    public static void main(String[] args) {

        int a=1;
        int b=2;
        System.out.println("Before swap : "+a +" and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap : "+a +" and "+b);




    }
}
