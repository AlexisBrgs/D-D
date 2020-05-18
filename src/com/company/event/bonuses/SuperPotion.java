package com.company.event.bonuses;

import com.company.characters.Hero;
import com.company.event.Event;

public class SuperPotion extends Bonus implements Event {


    public SuperPotion() {

        super(5, 0);
    }

    public String toString(){
        return "Hey, a Super POTION !";
    }


    public void interact(Hero h){
        add(h);
    }
}
