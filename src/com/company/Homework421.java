package com.company;

import java.util.Random;

public class Homework421 {

    public static void main(String[] args) {

        Random random = new Random();
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

        int minimumValue = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (minimumValue > matrix[i][j]) {
                    minimumValue = matrix[i][j];
                }
            }
        }
        System.out.println("The minimum value of the matrix is: " + minimumValue);
    }
}