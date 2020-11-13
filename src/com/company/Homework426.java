package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework426 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }
        System.out.println();
        System.out.println("The initial matrix is:");
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int inputingNumber;

        do {
            System.out.println("---------------------------MENU---------------------------");
            System.out.println("Press 1 for rotating the matrix in 90 degree clockwise.");
            System.out.println("Press 2 for rotating the matrix in 180 degree clockwise.");
            System.out.println("Press 3 for rotating the matrix in 270 degree clockwise.");
            System.out.println("Press 4 for exit.");
            System.out.println("----------------------------------------------------------");
            System.out.print("Please enter the number: ");
            inputingNumber = scanner.nextInt();

            if (inputingNumber == 1) {
                System.out.println("The final matrix is (rotated in 90 degree clockwise):");
                System.out.println();
                for (int j = 0; j < matrix.length; j++) {
                    for (int i = matrix.length - 1; i >= 0; i--) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            } else if (inputingNumber == 2) {
                System.out.println("The final matrix is (rotated in 180 degree clockwise):");
                System.out.println();
                for (int i = matrix.length - 1; i >= 0; i--) {
                    for (int j = matrix.length - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            } else if (inputingNumber == 3) {
                System.out.println("The final matrix is (rotated in 270 degree clockwise):");
                System.out.println();
                for (int j = matrix.length - 1; j >= 0; j--) {
                    for (int i = 0; i < matrix.length; i++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            } else if (inputingNumber == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Wrong number, please try again.");
            }
            System.out.println();
        } while (true);
    }
}