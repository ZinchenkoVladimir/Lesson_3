package main.java;

import java.util.Scanner;

public class Task_7 {

    public static void main (String[]args){

        System.out.println("Enter two integers in range from -2147483648 to 2147483647 separated by a space, then press Enter:");

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println(getGreatestCommonDivisor(first, second));
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10){
            return -1;
        }
        else return getGCD(first,second);
    }

    private static int getGCD(int first, int second){

        return first == 0 ? second : getGCD(second % first, first);
    }
}
