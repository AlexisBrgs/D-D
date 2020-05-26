package com.company;

import com.company.characters.Hero;
import com.company.event.enemies.Enemy;

import java.util.Scanner;

public class Fight {

    enum Status {
        RUN_AWAY,
        ENEMY_DEAD,
        HERO_DEAD
    }

    protected int tour = 0;

    public Status start(Hero h, Enemy e) {

        Scanner sc = new Scanner(System.in);
        String choice;
        while (true) {

            System.out.println("Do you really want to fight this round ? (Y/n)");
            choice = sc.nextLine().toUpperCase();
            switch (choice) {
                case "N" -> {
                    return Status.RUN_AWAY;
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
                            return Status.HERO_DEAD;
                        }
                    }

                    else {
                        System.out.println("You fucked him, he's screwed");
                        return Status.ENEMY_DEAD;
                    }
                }
            }
        }

    }
}
