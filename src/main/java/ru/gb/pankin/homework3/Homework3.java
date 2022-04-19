package ru.gb.pankin.homework3;

public class Homework3 {
    public static void main(String[] args) {
        invertArray();
    }
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
    }
}}









