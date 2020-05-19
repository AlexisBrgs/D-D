package com.company.event.enemies;

import com.company.characters.Hero;
import com.company.event.Event;

public class Dragon  extends Enemy implements Event{

public Dragon(){
    super(15,4);
}
    public String toString(){
        return "Hey, a dragon !";
    }

    @Override
    public void interact(Hero h){
        System.out.println("Engage le combat goblin");
        attack(h);
    }

}
