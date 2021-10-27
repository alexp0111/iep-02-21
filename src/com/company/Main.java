package com.company;
//Petrovskiy A. A.
//20.10.21

import com.company.Figures.Shapes.Rectangle;
import com.company.Figures.Shapes.Square;
import com.company.Interfaces.DamageTaker;
import com.company.Interfaces.DeathNotifier;
import com.company.Types.AlyansHero;
import com.company.Types.Tower;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");

        Tower tower = new Tower();
        Hero alyansHero = new AlyansHero(100);

        DeathNotifier cosoleDeathNotifier = new CosoleDeathNotifier();

        alyansHero.setDeathNotifier(cosoleDeathNotifier);

        System.out.println(alyansHero);

        applySomeDamage(alyansHero);
    }

    private static void applySomeDamage(DamageTaker alyansHero) {
        System.out.println("==================");

        int d = (int) (Math.random()*200);
        System.out.println("Damage is: " + d);
        alyansHero.takeDamage(d);
        System.out.println(alyansHero);

        System.out.println("==================");
    }
}
