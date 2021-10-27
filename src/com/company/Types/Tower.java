package com.company.Types;

import com.company.Interfaces.DamageTaker;

public class Tower implements DamageTaker {

    @Override
    public void takeDamage(int damage) {
        System.out.println("Стена получила " + damage + " урона");
    }
}
