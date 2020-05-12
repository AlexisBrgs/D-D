package com.company;


import java.util.Scanner;

public class Game {
    int pos = 0;
    int board = 64;
    int lap = 0;
    int dice1 = 0;
    public int randomise(){
    dice1 = 1 + (int) (Math.random() * 6);
    return dice1;
    }

    public void move(){
        while (pos<board) {
            int dice = randomise();
            pos = pos + dice;
            lap++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Lap " +lap+"\n You throw a " + dice + "\n Your current position is " +pos+ "\n Press any key to continue");
            sc.nextLine();
        }

        System.out.println("You won, after " + lap + " laps ! \n GOOD GAME, IT WAS SO HARD ! ");

    }
}
