package com.company.event.bonuses;

import com.company.characters.Hero;
import com.company.characters.Mage;
import com.company.event.Event;

public class Thunder extends Bonus implements Event {

    public Thunder() {
        super(0, 2);
    }
    public String toString() {
        return "Hey look, there's a thunder orb over there !";
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
