package com.company.event.enemies;

import com.company.characters.Hero;


public class Witcher extends Enemy {

    public Witcher (){
        super(9,2);
    }

    public String toString(){
        return "Hey, a witcher !";
    }

    @Override
    public void interact(Hero h){
        System.out.println("---------------------------------------" +
                "\n FIGHT THE GOBLIN PHASE, press enter !"
                + "\n---------------------------------------");
    }
}
