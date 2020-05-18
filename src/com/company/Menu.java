package com.company;

import com.company.characters.*;

import java.util.Scanner;


public class Menu {
    Scanner sc = new Scanner(System.in);

    public String choose() {
        boolean isReady = false;
        String playerChoice = "";


        while (!isReady) {
            System.out.println("Choose your character : Type 'Warrior', 'Mage' or 'Q' if you want to quit.");
            playerChoice = sc.nextLine().toUpperCase();

            switch (playerChoice) {
                case "WARRIOR", "MAGE" -> {
                    System.out.println("You are a " + playerChoice + ", Harry !");
                    isReady = true;
                }

                case "Q" -> {
                    System.out.println("You will quit this astonishing game, are you sure ? (Y/n)");
                    playerChoice = sc.nextLine().toUpperCase();
                    switch (playerChoice) {
                        case "Y" -> {
                            isReady = true;
                            System.exit(0);
                        }
                        case "N" -> {
                        }
                    }
                }
                default -> System.out.println("Bad choice...");
            }
        }
        System.out.println("Goood. Now let's define your character." +
                "\nFollow my instructions, press enter ! ");
        sc.nextLine();
        return playerChoice;

    }


    public void fillHero(Hero h) {


        System.out.println("What is your name, " + h.getType() + ":");
        String name = sc.nextLine();
        h.setName(name);


        System.out.println("How much life do you have, " + name + " ?" +
                "\n [Value between " + h.getMIN_Life() + " and " + h.getMAX_Life() + " HP]");
        int life = sc.nextInt();
        h.setLife(life);


        System.out.println("What is your strength, " + name + " ?"
                + "\n [Value between " + h.getMIN_Strength() + " and " + h.getMAX_Strength() + " strength points]");
        int strength = sc.nextInt();
        h.setStrength(strength);


    }


    public Hero createHero() {
        String choice = choose();
        Hero h;
        if (choice.equals("WARRIOR")) {
            h = new Warrior();

        } else {
            h = new Mage();
        }

        fillHero(h);
        System.out.println(h.toString());

        return h;
    }


}