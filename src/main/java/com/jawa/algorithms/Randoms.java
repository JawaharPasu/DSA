package com.jawa.algorithms;

import com.sun.source.tree.IfTree;

import java.util.Arrays;

public class Randoms {

    // print the patterns like this for any given required rows
    // 1111111
    // 222222
    // 33333
    // 4444
    // 555
    // 66
    // 7
    public static void printPatternTriangle(int row) {
        for (int i = 1 ; i <= row; i++) {
            for (int j=0 ; j<=row-i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // print the following pattern
    //      *
    //     ***
    //    *****
    //     ***
    //      *
    public static void printDiamondPattern(int row) {
        for (int i = 0; i<=row; i++) {
            for (int j=1; j<=row -i; j++) {
                System.out.print(" ");
            }
            for (int j =1; j<= 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row -1; i>=0; i--) {
            for (int j=1; j<=row -i; j++) {
                System.out.print(" ");
            }
            for (int j =1; j<= 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
