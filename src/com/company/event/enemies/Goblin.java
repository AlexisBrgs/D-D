package com.company.event.enemies;

import com.company.Fight;
import com.company.characters.Hero;


public class Goblin extends Enemy  {

    public Goblin (){
        super(6,1);
    }
    public String toString(){
        return "Hey, a goblin !";
    }

    @Override
    public void interact(Hero h){
        System.out.println("---------------------------------------" +
                "\n FIGHT THE GOBLIN PHASE, press enter !"
                + "\n---------------------------------------");
    }
}
