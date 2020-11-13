package com.company;

import java.util.Random;

public class Homework424 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matrix = new int[10][15];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }
        System.out.println("The initial matrix is:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The final matrix is (rotated in 180 degree clockwise):");

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix.length + 4; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}