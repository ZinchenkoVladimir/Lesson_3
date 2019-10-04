package main.java;

import java.util.Scanner;

public class Task_6 {

    public static void main (String[]args){

        System.out.println("Enter one integer in range from -2147483648 to 2147483647, then press Enter:");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(getEvenDigitSum(a));
    }

    public static int getEvenDigitSum (int a){

        int sum = 0;

        if (a >= 0) {

            while (a != 0) {

                int b = a % 10;
                a /= 10;

                if (b % 2 == 0) {
                    sum += b;
                }
            }
            return sum;
        }
        return sum = -1;
    }
}
