package main.java;

import java.util.ArrayList;

public class Task_1 {

    private String c1 = "While:";
    private String c2 = "Do While:";
    private String c3 = "For:";
    private String c4 = "For Each:";
    private String c5 = "Цикл ";
    private String x = "\n";
    private final int a = 10;
    private boolean y;
    private int i;
    private int nums[];

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

    public String getC5() {
        return c5;
    }

    public String getX() {
        return x;
    }

    public int getA() {
        return a;
    }

    public boolean getY() {
        return y;
    }

    public int getI() {
        return i;
    }

    public int[] getNUM() {
        return nums;
    }

    public static void main (String[] args) {

        Task_1 service_for_cycles = new Task_1();
        int a = service_for_cycles.getA();
        String c1 = service_for_cycles.getC1();
        String c2 = service_for_cycles.getC2();
        String c3 = service_for_cycles.getC3();
        String c4 = service_for_cycles.getC4();
        String c5 = service_for_cycles.getC5();
        String x = service_for_cycles.getX();
        boolean y = service_for_cycles.getY();
        int i = service_for_cycles.getI();
        int[] nums = service_for_cycles.getNUM();

        ArrayList<String> cycle_while = service_for_cycles.getArrayByWhile(a);
        ArrayList<String> cycle_do_while = service_for_cycles.getArrayByDoWhile(a);
        ArrayList<String> cycle_for = service_for_cycles.getArrayByFor(a);
        ArrayList<String> cycle_for_each = service_for_cycles.getArrayByForEach(a);

        System.out.println(
                c5 + c1 + x + cycle_while + x + x +
                c5 + c2 + x + cycle_do_while + x + x +
                c5 + c3 + x + cycle_for + x + x +
                c5 + c4 + x + cycle_for_each);
    }

    public static boolean condition (int a, boolean y) {
        y = a <= 20 ? true : false;
        return y;
    }

    public static int bodyCycle (ArrayList<String> cycle, int a) {
        cycle.add(a + "");
        return ++a;
    }

    public static int increment (int a) {
        return a++;
    }

    public static int[] iteration (int[] nums) {
        return new int[] {1, 2, 3, 4, 5, 6, 7, 9, 8, 10, 11};
    }

    private ArrayList<String> getArrayByWhile (int a) {

        ArrayList<String> cycle = new ArrayList<>();

        while (condition(a, y)) {
            a = bodyCycle(cycle, a);
        }
        return cycle;
    }

    private ArrayList<String> getArrayByDoWhile (int a) {

        ArrayList<String> cycle = new ArrayList<>();

        do {
            a = bodyCycle(cycle, a);
        }
        while (condition(a, y));

        return cycle;
    }

    private ArrayList<String> getArrayByFor (int a) {

        ArrayList<String> cycle = new ArrayList<>();

        for (; condition(a, y); increment(a)) {
            a = bodyCycle(cycle, a);
        }

        return cycle;
    }

    private ArrayList<String> getArrayByForEach (int a) {

        ArrayList<String> cycle = new ArrayList<>();

        for (int s : iteration(nums)) {
            a = bodyCycle(cycle, a);
        }

        return cycle;
    }
}
