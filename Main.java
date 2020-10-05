package com.javalearn.online;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner put = new Scanner(System.in);
        System.out.println("Что посчитать, Повелитель?");
        boolean d = true;
        while (d = true) {
            String y = put.nextLine();
            input input = new input(y);
            input.check();
            Calculator calculator = new Calculator(y);
            calculator.setA(input.a);
            calculator.setB(input.b);
            calculator.calculate();
            output output = new output(y, input.masArab, input.masRim, input.l1, input.l2);
            output.outconsole();
        }
    }
}

