package com.company.event.enemies;

import com.company.characters.Hero;
import com.company.event.Event;

public class Goblin extends Enemy implements Event {

    public Goblin (){
        super(6,1);
    }
    public String toString(){
        return "Hey, a goblin !";
    }

    @Override
    public void interact(Hero h){
        attack(h);
    }
}
