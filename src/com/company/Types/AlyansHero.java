package com.company.Types;

import com.company.Hero;

public class AlyansHero extends Hero {

    public AlyansHero(int hp) {
        super(hp);
    }

    @Override
    public String getPhraze() {
        return "Za Alyans";
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("AlyansHero получил " + damage + " урона");
        applyDamage(damage);
    }


}
