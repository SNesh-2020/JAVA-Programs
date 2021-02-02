package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int[] newArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            newArray[val] = i;
        }
        System.out.println("The new array is: ");
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
