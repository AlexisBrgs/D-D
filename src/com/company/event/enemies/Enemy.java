package com.company.event.enemies;

import com.company.characters.Hero;
import com.company.event.Event;

public abstract class Enemy implements Event {

    protected int strength;
    protected int life;

    public Enemy(int life, int strength) {
        this.life = life;
        this.strength = strength;
    }

    public void attack(Hero h) {
int tour=0;

        while (h.getLife() < 0 || this.life < 0)
        {
                this.life -= h.getStrength();
                h.setLife(h.getLife() - this.strength);
                tour++;
                System.out.println("Fight number " +tour +
                        "\n You dealt " +h.getStrength() +
                        "\n You have " +h.getLife() + " HP left.");
        }


    }

    public void interact(Hero h) {
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }
}
