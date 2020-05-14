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

                case "Esc" -> {
                    System.out.println("You will quit this astonishing game, are you sure ? (Y/n)");
                    isReady = true;
                    //Creer méthode pour quitter


                }

                default -> System.out.println("Bad choice...");
            }
        }
        System.out.println("Goood. Now let's define your character." +
                "\nFollow my instructions, press enter ! ");
        sc.nextLine();
        return playerChoice;

    }


    public void createHero() {
        String choice = choose();

        if (choice.equals("WARRIOR")) {
            Hero w = new Warrior();
            fillHero(w);
            System.out.println(w.toString());
        } else {
            Hero m = new Mage();
            fillHero(m);
            System.out.println(m.toString());

        }
    }


    public void fillHero(Hero h) {


        System.out.println("What is your name, " +h.getType()+ ":");
        String name = sc.nextLine();
        h.setName(name);


        int life;
        do {
            System.out.println("How much life do you have, " + name + " ?" +
                    "\n [Value between " +h.getMIN_Life()+ " and " +h.getMAX_Life()+ " HP]");
            life = sc.nextInt();
        } while (!(h.getMIN_Life() <= life && life <= h.getMAX_Life()));
        h.setLife(life);


        int strength;
        do {
            System.out.println("What is your strength, " + name + " ?"
                    +"\n [Value between " +h.getMIN_Strength()+ " and " +h.getMAX_Strength()+ " strength points]");
            strength = sc.nextInt();
        } while (!(h.getMIN_Strength() <= strength && strength <= h.getMAX_Strength()));
        h.setStrength(strength);


        System.out.println(name
                + ", I'm sorry to tell you this, but you have "
                + h.getAttack() + " bonus attack points for the moment... :'(");


    }

}