package com.company.event.enemies;

import com.company.characters.Hero;
import com.company.event.Event;



public abstract class Enemy implements Event {

    protected int strength;
    protected int life;
    public int tour = 0;

    public Enemy(int life, int strength) {
        this.life = life;
        this.strength = strength;
    }

    public void attack(Hero h) {
        boolean isOver = false;
            while (!isOver) {
                tour++;
                this.life -= h.getStrength();
                System.out.println("Fight number " + tour +
                        "\n You dealt " + h.getStrength() + " of damage.");

                if (this.life > 0) {
                    h.setLife(h.getLife() - this.strength);


                    if (h.getLife() > 0) {
                        System.out.println(
                                "\n You have " + h.getLife() + " HP left.");

                    } else {
                        System.out.println("T'es mort comme la sous merde que tu es.");
                        isOver = true;
                    }
                } else {
                    System.out.println("You fucked him, he's screwed");
                    isOver = true;
                }
            }


        }




    public abstract void interact(Hero h);

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }
}
