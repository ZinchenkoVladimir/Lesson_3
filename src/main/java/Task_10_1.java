package main.java;

public class Task_10_1 {

    public static void main (String[]args){

        int i = 0;
        String a = "*        *";
        String b = "**********";

        while (i<5) {

            switch (i) {

                case 0:
                case 4:
                    System.out.println(b);
                    break;

                case 1:
                case 2:
                case 3:
                    System.out.println(a);
                    break;
            }
            i++;
        }
    }
}