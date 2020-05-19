package com.company.event.enemies;

import com.company.characters.Hero;
import com.company.event.Event;

public class Witcher extends Enemy implements Event {

    public Witcher (){
        super(9,2);
    }

    public String toString(){
        return "Hey, a witcher !";
    }

    @Override
    public void interact(Hero h){
        System.out.println("Engage le combat witcher");
        attack(h);
    }
}
