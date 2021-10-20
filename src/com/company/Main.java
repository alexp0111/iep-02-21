package com.company;
//Petrovskiy A. A.
//20.10.21

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");

        Person.setHeightPoint(1.3, 1.6);

        Person[] people = getPeople();
        for (Person p : people)
            System.out.println("Name: " + p.getName() + " Height: " + df.format(p.getHeight()*100) + " " + p.getPrettyHeigh());
    }

    private static Person[] getPeople() {
        return new Person[] {
                new Person("Alex", random() * 2),
                new Person("Dima", random() * 2),
                new Person("Egor", random() * 2),
                new Person("", random() * 2),
                new Person("Petya", random() * 2),
                new Person("Ivan", random() * 2),
        };
    }
}
