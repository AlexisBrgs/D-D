package com.company.event.bonuses;

import com.company.characters.Hero;
import com.company.event.Event;

public class LittlePotion extends Bonus implements Event {

    public LittlePotion() {

        super(2, 0);
    }

    public String toString(){
        return "Hey a little Potion !";
    }


    public void interact(Hero h){
        add(h);
    }

}
