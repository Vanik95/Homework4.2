package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework422 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[10][15];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }
        System.out.println("The matrix is:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Input the row number.");
        int rowNumber = scanner.nextInt();
        int sumRowElements = 0;

        if (rowNumber >= 0 && rowNumber <= 9) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (rowNumber == i) {
                        sumRowElements = sumRowElements + matrix[i][j];
                    }
                }
            }
            System.out.println("The row number is: " + rowNumber);
            System.out.println("The sum of row elements is: " + sumRowElements);
        } else {
            System.out.println("The row number is wrong.");
        }
    }
}