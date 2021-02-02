package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
        //Pattern 0
        /*
//        for (int i = 1; i <= n; i++) {
//            //work
//            System.out.println("*");
//            //prepration
//            System.out.println();
//        }
//        int row = 1;
//        while(row <= n){
//            System.out.print("*");
//            System.out.println();
//            row = row + 1;
//        }

         */

        /*
        //pattern 1
//        int row = 1;
//        while(row <= n){
//            //work
//                int col = 1;
//                while(col <= n){
//                    System.out.print("*");
//                    col = col + 1;
//                }
//            //prep
//            System.out.println();
//            row = row + 1;
//        }
        //pattern2
//        int nst = n;        //if nst = n, the decrement triangle and if nst = 1 the increment triangle
//        int row = 1;
//        while(row <= n){
//            //work
//            int cst = 1;
//            while(cst <= nst){
//                System.out.print("*");
//                cst++;
//            }
//            System.out.println();
//            nst--;                  //nst++ in case of increment triangle
//            row = row+1;
//        }

         */

       /*
        //Pattern4
//        int nsp = n-1;
//        int nst = 1;
//        int row = 1;
//        while(row <= n){
//            //work
//              //nsp work
//                int csp = 1;
//                while(csp <= nsp){
//                    System.out.print(" ");
//                    csp++;
//                }
//              // nst work
//                int cst = 1;
//                while(cst <= nst){
//                    System.out.print("*");
//                    cst++;
//                }
//
//
//            System.out.println();
//            row = row + 1;
//            nsp--;
//            nst++;

        */
            //Pattern 5
/*
            int nst = n;
            int nsp = 0;

            // rows
            int row = 1;
            while(row <= n){
                //work
                    //space work
                    int csp = 0;
                    while(csp <= nsp){
                        System.out.print(" ");
                        csp++;
                    }
                    //stars work
                    int cst = 1;
                    while(cst <= nst){
                        System.out.print("*");
                        cst++;
                    }
               // preparation
                System.out.println();
                row++;
                nst--;
                nsp++;

        }

 */
        //Pattern 6
/*
        int nr = 2 *n - 1;
        int nst = 1;
        int row = 1;
        while(row <= nr){
            //work
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            //preparation
            System.out.println();
            if(row <= nr/2){
                nst++;
            }else{
                nst--;
            }
            row++;
        }
*/
        //Pattern 7
/*
        int nst = n/2;
        int nsp = 1;
        //row
        int row = 1;
        while(row <= n){

            //work
              //stars
                for(int cst = 1; cst<=nst; cst++){
                    System.out.print("*");
                }
              //space
                for(int csp = 1; csp<=nsp; csp++){
                    System.out.print(" ");
                }
              //stars
                for(int cst = 1; cst<=nst; cst++){
                    System.out.print("*");
                }
            //preparation
                System.out.println();
                if(row <= n/2){
                    nsp = nsp + 2;
                    nst = nst - 1;
                }else{
                    nsp = nsp - 2;
                    nst = nst + 1;
                }
                row++;

        }

 */
        //function call
        System.out.println("Hello");
        int sum = additionReturn(10,20);
        System.out.println(sum);
        System.out.println("Bye.");

    }
    //function definition
    public static int additionReturn(int a, int b){
        int c = a+b;
        return c;
    }
}


