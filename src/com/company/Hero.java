package com.company;

import com.company.Interfaces.DamageTaker;
import com.company.Interfaces.DeathNotifier;

public abstract class Hero implements DamageTaker {
    private int hp;
    private DeathNotifier deathNotifier;

    public Hero(int hp) {
        this.hp = hp;
    }

    public abstract String getPhraze();
    public boolean isAlive() { return hp > 0; }

    public int getHp() {
        return hp;
    }

    public void applyDamage(int damage) {
       hp -= damage;
       if (!isAlive()) {
           hp = 0;
           deathNotifier.newDeath(this);
       }
    }

    @Override
    public void takeDamage(int damage) {
        this.applyDamage(damage);
    }

    @Override
    public String toString() {
        return "Hero { " +
                "phraze = " + getPhraze() +
                "; hp = " + getHp() +
                "; alive? = " + (isAlive() ? "yes" : "no") +
                " }";
    }

    public void setDeathNotifier(DeathNotifier deathNotifier) {
        this.deathNotifier = deathNotifier;
    }
}
