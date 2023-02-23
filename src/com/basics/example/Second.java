package com.basics.example;

public class Second {
    public static void main(String[] args) {
        for (int i =0; i< 5; i++){
            System.out.print("\t\t");
            for (int j =0; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
