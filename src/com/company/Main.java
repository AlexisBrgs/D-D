package com.company;

import com.company.characters.Hero;

public interface Main {

    static void main(String[] args) {


        Menu menu = new Menu();
        Hero h = menu.createHero();
        Game game = new Game(h);
        game.play();


    }

}


