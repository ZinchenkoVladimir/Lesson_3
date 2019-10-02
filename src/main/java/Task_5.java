package main.java;

import java.util.Scanner;

public class Task_5 {

    public static void main (String[] args) {

        System.out.println("Enter four integers separated by a space, then press Enter (all non-digital characters will be erased):");

        Scanner scanner = new Scanner(System.in);

        String e = scanner.next().replaceAll("[^\\d]", "");
        String f = scanner.next().replaceAll("[^\\d]", "");
        String g = scanner.next().replaceAll("[^\\d]", "");
        String h = scanner.next().replaceAll("[^\\d]", "");

        int a = Integer.parseInt(e.length() == 0 ? e = "0" : e);
        int b = Integer.parseInt(f.length() == 0 ? f = "0" : f);
        int c = Integer.parseInt(g.length() == 0 ? g = "0" : g);
        int d = Integer.parseInt(h.length() == 0 ? h = "0" : h);

        System.out.println(min1(a,b,c,d));
    }

    public static int min1(int a, int b, int c, int d) {

        return min2(min2(a, b), min2(c, d));
    }

    public static int min2(int a, int b) {

        return a<b ? a : b;
    }
}
