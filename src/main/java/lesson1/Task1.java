package main.java.lesson1;

public class Task1 {
    private int a;
    private int b;
    private int c;
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
//    public static void main(String[] args) {
//        System.out.println(min(5,2,3));
//
//    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static int min(int a, int b, int c) {

        if (a >= b && c >= b) {
            return b;
        }
        else if (b >= a && c >= a) {
            return a;
        }
        else  {
            return c;
        }

    }

}
