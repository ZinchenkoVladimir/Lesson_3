package main.java;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(min1(a,b,c,d));
    }

    public static int min1(int a, int b, int c, int d) {

        return min2(min2(a, b), min2(c, d));
    }

    public static int min2(int a, int b) {

        return a<b ? a : b;
    }
}
