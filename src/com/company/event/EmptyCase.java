package com.company.event;

import com.company.characters.Hero;

public class EmptyCase implements Event{


    public void EmptyCase(){
        System.out.println("Je suis une case vide");
    }

    @Override
    public void interact(Hero h) {

    }
}
