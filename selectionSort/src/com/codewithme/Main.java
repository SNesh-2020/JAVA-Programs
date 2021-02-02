package com.codewithme;

import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the length of the array : ");
        int n = scn.nextInt();
        System.out.println("Please enter the value of the array: ");
        int[] arr = new int[n];
        takeInput(arr);
        System.out.println("Constructed array is: ");
        printArray(arr);
        selectionSort(arr);
        System.out.println();
        System.out.println("The selection sort result:");
        printArray(arr);

    }
    public static void takeInput(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
