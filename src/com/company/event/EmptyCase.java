package com.company.event;

import com.company.characters.Hero;

public class EmptyCase implements Event {


    public String toString() {
        return " Empty case, there's nothing around here...";
    }

    @Override
    public void interact(Hero h) {

    }
}
