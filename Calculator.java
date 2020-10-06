package com.javalearn.online;

public class Calculator{

    public String[] y;

    public int z;
    int a, b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Calculator(String y) {
        this.y = y.split(" ");
    }

    public int getZ() {
        return z;
    }

    public void calculate() {
        if ( a > 10 || a < 1 || b < 1 || b > 10 ) {
            System.out.println("Неправильно введены данные");
            System.exit(0);
        }
        if ( y[1].charAt(0) == 43 ) {
            z = a + b;
        } else if ( y[1].charAt(0) == 45 ) {
            z = a - b;
        } else if ( y[1].charAt(0) == 42 ) {
            z = a * b;
        } else if ( y[1].charAt(0) == 47 ) {
            z = a / b;
        } else {
            System.out.println("Неправильно введены данные");
            System.exit(0);
        }
    }
}
