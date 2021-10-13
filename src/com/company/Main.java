package com.company;
//Petrovskiy A. A.
//13.10.21

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Calculator calc = new Calculator();

        calc.setA(in.nextInt());
        calc.setB(in.nextInt());

        Person pers = new Person();

        pers.setName(in.next());
        pers.setHeight(in.nextDouble());

        System.out.println(calc.sumAB());
        System.out.println(pers.getName() + " " + pers.getHeight());
    }
}
