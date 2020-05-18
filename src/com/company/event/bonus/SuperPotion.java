package com.company.event.bonus;

import com.company.characters.Hero;
import com.company.event.Event;

public class SuperPotion implements Event {

    @Override
    public void interact(Hero h){}

    public String toString(){
        return "Hey, a Super POTION !";
    }
}
