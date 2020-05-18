package com.company;

import com.company.characters.Hero;
import com.company.event.BoardGame;

import java.util.Scanner;


public class Game {

    int pos = 0;
    int board = 64;
    int turn = 0;
    int d = 0;
    Hero hero;

    public Game(Hero hero) {
        this.hero = hero;
    }

    public int randomise() {
        d = 1 + (int) (Math.random() * 6);
        return d;
    }


    // On définit la méthode move avec l'exception
    public void move(int dice) throws outOfGameException {
        if (pos + dice > board) {
            throw new outOfGameException();
        }
        pos += dice;
    }


    public void play() {
        BoardGame boardgame = new BoardGame();
        Scanner sc = new Scanner(System.in);
        while (pos < boardgame.bg.size()) {

            int dice = randomise();

            // On définit l'exception pour move ou non
            try {
                move(dice);
            } catch (outOfGameException e) {
                System.out.println(e.getMessage());
            }

            turn++;

            System.out.println("---------------------------------------"
                    + "\n                TURN " + turn
                    + "\n---------------------------------------"
                    + "\n You throw a " + dice
                    + "\n Your current position is " + pos
                    + "\n " + boardgame.bg.get(pos)
                    + "\n---------------------------------------"
                    + "\n Press enter to continue.");
            sc.nextLine();

            //Pré combat
            System.out.println("---------------------------------------"+
                    "\n Drop / Fight phase, press enter !"
                    + "\n---------------------------------------");
            sc.nextLine();
            boardgame.bg.get(pos).interact(this.hero);

            //Rappel des stats du hero
            System.out.println("---------------------------------------"
                    + "\n "+this.hero.getName() +" stats at the end of turn"
                    + "\n---------------------------------------"
                    + "\n You are a " +this.hero.getType()
                    + "\n You now have " + this.hero.getLife() +" HP."
                    + "\n You now have " + this.hero.getStrength() +" of Strength."
                    + "\n---------------------------------------"
                    + "\n Press enter to continue.");
            sc.nextLine();


        }

        System.out.println("You won, after " + turn + "turns ! \n GOOD GAME, IT WAS SO HARD ! ");

    }
}
