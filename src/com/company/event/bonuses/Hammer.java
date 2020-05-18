package com.company.event.bonuses;

import com.company.characters.Hero;
import com.company.characters.Warrior;
import com.company.event.Event;

public class Hammer extends Bonus implements Event {


    public Hammer() {
        super(0, 3);
    }

    public String toString(){
        return "There is a fucking hammer over there !";
    }




    public void interact(Hero h){
        if(h instanceof Warrior){
            System.out.println("You can drop this weapon !");
            add(h);
        }
        else {
        System.out.println("Get the fuck out Gandalf, you can't drop that !");
    }}
}
