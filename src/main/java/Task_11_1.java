package main.java;

public class Task_11_1 {

    public static void main(String[] args) {

        int a = 0;
        int rows = 6;
        String b = " ";
        String c = "*";

        while(a < 6){

            for (int i = 0; i < rows - a; i++) {
                System.out.print(b);
            }

            for (int i = 0; i < a*2 + 1; i++) {
                System.out.print(c);
            }

            System.out.println();
            a++;
        }
    }
}