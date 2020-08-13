package com.montaser;

public class Main {

    public static void main(String[] args) {
	    var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        int wageWithoutExtra = employee.calculateWage();
        System.out.println(wage);
        System.out.println(wageWithoutExtra);
    }
}
