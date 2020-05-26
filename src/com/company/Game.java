package com.company;

import com.company.characters.Hero;
import com.company.event.BoardGame;
import com.company.event.Event;
import com.company.event.enemies.Enemy;

import java.util.Scanner;

import static com.company.Fight.Status;


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


    public void moveBack(int dice) {
        if (pos + dice < 0) {
            pos=0;
        }
        pos -= dice;
    }

    public void play() {
        BoardGame boardgame = new BoardGame();
        Scanner sc = new Scanner(System.in);
        while (pos < BoardGame.BG_LENGTH) {

            int dice = randomise();
            // On définit l'exception pour move ou non
            try {
                move(dice);
            } catch (outOfGameException e) {
                System.out.println(e.getMessageForward());
            }

            turn++;

            System.out.println("---------------------------------------"
                    + "\n                TURN " + turn
                    + "\n---------------------------------------"
                    + "\n You throw a " + dice
                    + "\n Your current position is " + pos
                    + "\n " + boardgame.getEvent(pos)
                    + "\n---------------------------------------"
                    + "\n Press enter to continue.");
            sc.nextLine();


            Event ev = boardgame.getEvent(pos);
            ev.interact(this.hero);
            sc.nextLine();
            if (ev instanceof Enemy) {
                Enemy enemy = (Enemy) ev;

                Fight fight = new Fight();
                Status result = fight.start(hero, enemy);
                switch (result) {

                    case RUN_AWAY -> {
                        System.out.println("You are a fucking wet blanket, let's roll a dice to punish you and get back ");
                            moveBack(dice);

                        System.out.println("---------------------------------------"
                                + "\n                MALUS TURN"
                                + "\n---------------------------------------"
                                + "\n You have to back from " + dice
                                + "\n Your current position is " + pos
                                + "\n " + boardgame.getEvent(pos)
                                + "\n---------------------------------------"
                                + "\n Press enter to continue.");
                        sc.nextLine();


                    }

                    case ENEMY_DEAD -> {
                        System.out.println("GG, YOU WON THIS FIGHT");
                    }
                    case HERO_DEAD -> {
                        System.out.println("You suck. GAME OVER");
                        System.exit(0);
                    }
                }
            }
            //Rappel des stats du hero
            System.out.println("---------------------------------------"
                    + "\n " + this.hero.getName() + " stats at the end of turn"
                    + "\n---------------------------------------"
                    + "\n You are a " + this.hero.getType()
                    + "\n You now have " + this.hero.getLife() + " HP."
                    + "\n You now have " + this.hero.getStrength() + " of Strength."
                    + "\n---------------------------------------"
                    + "\n Press enter to continue.");
            sc.nextLine();


        }

        System.out.println("You won, after " + turn + "turns ! \n GOOD GAME, IT WAS SO HARD ! ");

    }
}
