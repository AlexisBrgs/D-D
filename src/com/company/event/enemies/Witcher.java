package com.company.event.enemies;

import com.company.characters.Hero;
import com.company.event.Event;

public class Witcher implements Event {

    @Override
    public void interact(Hero h){}

    public String toString(){
        return "Hey, a witcher !";
    }
}