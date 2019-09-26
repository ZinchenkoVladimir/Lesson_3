package main.java;

import java.util.ArrayList;

public class Task_1 {

    private String c1 = "Цикл While:";
    private String c2 = "Цикл Do While:";
    private String c3 = "Цикл три:";
    private String c4 = "Цикл четыре:";
    private String x = "\n";
    private int a = 10;

    public String getC1() {
        return c1;
    }

    public String getC2() {
        return c2;
    }

    public String getC3() {
        return c3;
    }

    public String getC4() {
        return c4;
    }

    public String getX() {
        return x;
    }

    public int getA() {
        return a;
    }

    public static void main (String[] args) {

        Task_1 service_for_cycles = new Task_1();
        int a = service_for_cycles.getA();
        String c1 = service_for_cycles.getC1();
        String c2 = service_for_cycles.getC2();
        String c3 = service_for_cycles.getC3();
        String c4 = service_for_cycles.getC4();
        String x = service_for_cycles.getX();

        ArrayList<String> cycle_while = service_for_cycles.getArrayByWhile(a);
        ArrayList<String> cycle_do_while = service_for_cycles.getArrayByWhile(a);

        System.out.println(c1 + x + cycle_while + x + x + c2 + x + cycle_do_while);
    }

    private ArrayList<String> getArrayByWhile (int a) {

        ArrayList<String> cycle = new ArrayList<>();

                while (a <= 20) {
                cycle.add(a + "");
                a++;
                }

                return cycle;
    }

    private ArrayList<String> getArrayByDoWhile (int a) {

        ArrayList<String> cycle = new ArrayList<>();

        do {
            cycle.add(a + x);
            a++;
        }
        while (a <= 20);

        return cycle;
    }

}
