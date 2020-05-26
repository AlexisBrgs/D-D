package com.company.event.enemies;

import com.company.characters.Hero;
import com.company.event.Event;

import java.util.Scanner;


public abstract class Enemy implements Event {

    protected int strength;
    protected int life;


    public void setLife(int life) {
        this.life = life;
    }

    public Enemy(int life, int strength) {
        this.life = life;
        this.strength = strength;
    }

    public void attack(Hero h) {

    }


    public abstract void interact(Hero h);

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }
}
