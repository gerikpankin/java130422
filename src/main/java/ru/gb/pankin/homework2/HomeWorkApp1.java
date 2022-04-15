package ru.gb.pankin.homework2;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        within10and20(11, 6);
        System.out.println(within10and20(11, 6));
        isPositiveOrNegative(-4);
        isNegative(-5);
        System.out.println(isNegative(-5));
        printWordNTimes("vocabulary", 4);
    }

    public static boolean within10and20(int x1, int x2) {
        boolean a;
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }

    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printWordNTimes(String word, int times) {
        int i;
        for (i = 1; i <= times; i++ ) {
            System.out.println(word);
        }
    }
}
