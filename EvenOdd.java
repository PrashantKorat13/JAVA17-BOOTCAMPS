package com.smvs;

import java.util.Scanner;

    //even odd
    public class EvenOdd {
        public static void main(String[] args) {

            int n;
            System.out.print("Eneter Value : ");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();

            if(n%2==0)
                System.out.println("Given Value is Odd");
            else
                System.out.println("Given Value is Even");


        }
    }
