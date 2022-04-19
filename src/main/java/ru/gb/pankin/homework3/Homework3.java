package ru.gb.pankin.homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        arr[0] = 1;
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 1;
            System.out.println(arr[i]);
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

    public static void fillDiagonal() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            matrix[i][i] = 1;
            matrix[i][4 - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < 4; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}










