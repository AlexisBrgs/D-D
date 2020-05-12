package com.company;

import java.util.Scanner;


public class Menu {
    public void choose() {
        boolean isReady = false;

        while (!isReady) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your character : Warrior / Mage or Escape with Esc");
            String playerChoice = sc.nextLine();


            switch (playerChoice) {
                case "Warrior", "Mage" -> {
                    System.out.println("You are a " + playerChoice + ", Harry !");
                    isReady = true;
                }

                case "Esc" -> {
                    System.out.println("Exit the program !");
                    isReady = true;
                }

                default -> System.out.println("Bad choice...");
            }
        }
        Scanner start = new Scanner(System.in);
        System.out.println("Press any key to start the game !");
        start.nextLine();

    }


//    public Hero created(String charType) {
//        switch (charType) {
//            case "Warrior":
//                Warrior w = new Warrior();
//
//                break;
//
//            case "Mage":
//                Mage m = new Mage();
//
//
//                break;
//        }
//    }
}