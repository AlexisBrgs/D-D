package com.company.event;

import java.util.ArrayList;

public class BoardGame {

    public ArrayList<Case> bg = new ArrayList<>();

    public BoardGame() {
        for (int i = 0; i < 64; i++) {
            bg.add(new Case(i));
        }
    }

}
