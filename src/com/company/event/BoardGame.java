package com.company.event;

import com.company.event.enemies.*;
import com.company.event.bonuses.*;


import java.util.ArrayList;

public class BoardGame {



    public static final int BG_LENGTH = 64;

    private ArrayList<Event> bg = new ArrayList<>();

    public Event getEvent(int position){
        return bg.get(position);
    }

//    public boolean addEvent(int index, Event ev) {
//
//        if (index<BG_LENGTH && index>=0 && ev!=null){
//           bg.set(index,new EmptyCase());
//            return true;
//        }
//        return false;
//    }
//

    public BoardGame() {


        for (int i = 0; i <= BG_LENGTH; i++) {

            Event e;
            switch (i) {

                //Ennemies
                case 45, 52, 56, 62 -> {
                    e = new Dragon();

                }
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> {
                    e = new Witcher();

                }
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> {
                    e = new Goblin();
                }

                //Bonus cases
                case 2, 11, 5, 22, 38 -> {
                    e = new Hammer();
                }

                case 19, 26, 42, 53 -> {
                    e = new Sword();
                }

                case 1, 4, 8, 17, 23 -> {
                    e = new Thunder();
                }

                case 48, 49 -> {
                    e = new Fireball();
                }

                case 7, 13, 31, 33, 39, 43 -> {
                    e = new LittlePotion();
                }

                case 28, 41 -> {
                    e = new SuperPotion();
                }

                default -> e = new EmptyCase();

            }

            bg.add(e);
        }

    }

}