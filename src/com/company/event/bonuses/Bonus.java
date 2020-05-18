package com.company.event.bonuses;

import com.company.characters.Hero;
import com.company.event.Event;

public abstract class Bonus implements Event {


    protected int life;
    protected int strength;

    public Bonus(int life, int strength) {
        this.life = life;
        this.strength = strength;
    }

    public void add(Hero h) {

        h.setStrength(this.getStrength() + h.getStrength());
        h.setLife(this.getLife() + h.getLife());

    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

}











