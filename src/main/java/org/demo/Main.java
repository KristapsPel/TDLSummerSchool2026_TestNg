package org.demo;

import calculator.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(1,2);
        calculator.subtract(1,2);
        System.out.println(calculator.getHistory());
        calculator.divide(1,2);
        calculator.multiply(1,2);
        System.out.println(calculator.getHistory());
        calculator.clearHistory();
        System.out.println(calculator.getHistory());
    }
}