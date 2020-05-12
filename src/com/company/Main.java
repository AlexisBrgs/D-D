package com.company;

public class Main {

    public static void main(String[] args) {
//        Warrior Lolo = new Warrior();
//        System.out.println("Constructeur vide : " +Lolo.getName());
//
//        Warrior Roxane = new Warrior ("Roxane elle en a gros");
//        System.out.println("Constructeur avec nom en seul para : " +Roxane.getName());
//
//        Warrior Marvin = new Warrior ("Marvin c'est le seul à avoir lu les consignes", "imgtrolo", 5,10);
//        System.out.println("Constructeur complet  " +Marvin.toString());
//
//        Mage Lolo1 = new Mage();
//        System.out.println("Constructeur vide : " +Lolo1.getName());
//
//        Mage Roxane1 = new Mage ("Roxane elle en a gros");
//        System.out.println("Constructeur avec nom en seul para : " +Roxane1.getName());
//
//        Mage Marvin1 = new Mage ("Marvin c'est le seul à avoir lu les consignes", "imgtrolo", 5,10);
//        System.out.println("Constructeur complet  " +Marvin1.toString());


        Menu start = new Menu();
        start.choose();
        Game play = new Game();
        play.move();
    }

}


