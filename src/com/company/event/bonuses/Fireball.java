package com.company.event.bonuses;

import com.company.characters.Hero;
import com.company.characters.Mage;
import com.company.event.Event;

public class Fireball extends Bonus implements Event {

    public Fireball() {
        super(0,7);
    }
    public String toString() {
        return "Hey, a fireball !";
    }


    public void interact(Hero h) {

        if (h instanceof Mage) {
            System.out.println("You can drop this fireball, coz you're a Mage !");
            add(h);
        } else {
            System.out.println("Get the fuck out fucking dwarf, you can't drop that !");
        }
    }
}
