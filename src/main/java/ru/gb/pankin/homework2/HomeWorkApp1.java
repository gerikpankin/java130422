package ru.gb.pankin.homework2;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        within10and20(11, 6);
    }
    public static boolean within10and20(int x1, int x2) {
        boolean a;
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            a = true;}
        else {
            a = false;}
        System.out.println(a);
        return a;

    }


}
