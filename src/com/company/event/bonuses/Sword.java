package com.company.event.bonuses;

import com.company.characters.Hero;
import com.company.characters.Warrior;


public class Sword extends Bonus {

    public Sword() {
        super(0,5);
    }

    public String toString() {
        return "Hey look, a fuckin' sword on your way ! ";
    }


    public void interact(Hero h) {
        if (h instanceof Warrior) {
            System.out.println("You can drop this weapon !");
            updateStats(h);

        } else {
            System.out.println("Get the fuck out Gandalf, you can't drop that !");
        }
    }
}
