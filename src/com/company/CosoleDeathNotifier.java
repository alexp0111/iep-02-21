package com.company;

import com.company.Interfaces.DeathNotifier;

public class CosoleDeathNotifier implements DeathNotifier {
    @Override
    public void newDeath(Hero hero) {
        System.out.println("hero " + hero + " has died");
    }
}
