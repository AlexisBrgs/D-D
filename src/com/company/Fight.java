package com.company;

import com.company.characters.Hero;
import com.company.event.enemies.Enemy;

import java.util.Scanner;

public class Fight {
    public static final int RUN_AWAY = 1;
    public static final int ENEMY_DEAD = 2;
    public static final int HERO_DEAD = 3;

    protected int tour = 0;

    public int start(Hero h, Enemy e) {

        Scanner sc = new Scanner(System.in);
        String choice;
        while (true) {

            System.out.println("Do you really want to fight this round ? (Y/n)");
            choice = sc.nextLine().toUpperCase();
            switch (choice) {
                case "N" -> {
                    return RUN_AWAY;
                }
                case "Y" -> {
                    tour++;
                    System.out.println("Round number " + tour +
                            "\n- The creep has now " + e.getLife() + " HP.");
                    e.setLife(e.getLife() - h.getStrength());

                    System.out.println("- You dealt " + h.getStrength() + " of damage."
                            + "\n- The creep has " + e.getLife() + " HP.");

                    if (e.getLife() > 0) {
                        h.loseLife(e.getStrength());
                        System.out.println("The creep dealt you " + e.getStrength() + ".");
                        if (h.getLife() > 0) {
                            System.out.println(
                                    "\n- You have " + h.getLife() + " HP left.");

                        } else {
                            System.out.println("T'es mort comme la sous merde que tu es.");
                            return HERO_DEAD;
                        }
                    }

                    else {
                        System.out.println("You fucked him, he's screwed");
                        return ENEMY_DEAD;
                    }
                }
            }
        }

    }
}
