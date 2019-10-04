package main.java;

public class Task_11 {

    public static void main (String[] args) {

        int a = 0;
        int rows = 6;
        String b = " ";
        String c = "*";

        while(a < rows){

            int i = 0;

            while (i < rows-a) {
                System.out.print(b);
                i++;
            }

            int j = 0;

            while (j < a*2 + 1) {
                System.out.print(c);
                j++;
            }

            System.out.println();
            a++;
        }
    }
}