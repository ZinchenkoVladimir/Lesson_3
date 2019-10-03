package main.java;

public class Task_9 {

    public static void main (String[]args){

        int i = 0;
        String a = "*";
        String b = "*";

        while (i<7){
            System.out.println(a);
            a = a+b;
            i++;
        }
    }
}