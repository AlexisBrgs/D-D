package com.company;

import com.company.event.BoardGame;

import java.util.Scanner;


public class Game {
    int pos = 0;
    int board = 64;
    int turn = 0;
    int d = 0;


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

        while (pos < boardgame.bg.size()) {

            int dice = randomise();

            // On définit l'exception pour move ou non
            try {
                move(dice);
            } catch (outOfGameException e) {
                System.out.println(e.getMessage());
            }
            //Insérer la partie combat et rappel stats ?
            turn++;
            Scanner sc = new Scanner(System.in);
            System.out.println("---------------------------------------"
                    + "\n                TURN " + turn
                    + "\n---------------------------------------"
                    + "\n You throw a " + dice
                    + "\n Your current position is " + pos
                    + "\n" +boardgame.bg.get(pos)
                    + "\n Press enter to continue");
            sc.nextLine();
        }

        System.out.println("You won, after " + turn + "turns ! \n GOOD GAME, IT WAS SO HARD ! ");

    }
}
