package com.refresher.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TheArrays {
    public static void main(String[] args) {
        String[] temp ;
       // Arrays.stream(temp).forEach(System.out::println); // Another way to print elements of arrays.
        int[][] matrix = new int[2][4];
        Scanner scanner = new Scanner(System.in);


      System.out.println(matrix.length);
       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j< 4; j++){
                System.out.print("Enter element at [" + i + "," + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
