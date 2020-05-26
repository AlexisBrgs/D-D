package com.company.event.bonuses;

import com.company.characters.Hero;


public class SuperPotion extends Bonus {


    public SuperPotion() {

        super(5, 0);
    }

    public String toString(){
        return "Hey, a Super POTION !";
    }


    public void interact(Hero h){
        updateStats(h);
    }
}
