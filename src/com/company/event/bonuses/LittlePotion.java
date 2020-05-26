package com.company.event.bonuses;

import com.company.characters.Hero;


public class LittlePotion extends Bonus  {

    public LittlePotion() {

        super(2, 0);
    }

    public String toString(){
        return "Hey a little Potion !";
    }


    public void interact(Hero h){
        updateStats(h);
    }

}
