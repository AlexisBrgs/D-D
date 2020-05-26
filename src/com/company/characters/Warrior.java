package com.company.characters;

public class Warrior extends Hero {
    protected static final int MAX_LIFE = 10;
    protected static final int MIN_LIFE = 5;
    protected static final int MAX_STRENGTH = 10;
    protected static final int MIN_STRENGTH = 5;

    public Warrior() {
       this("Unknown Warrior");
    }


    public Warrior(String name) {
        this("Warrior", name, MIN_LIFE, MIN_STRENGTH);
    }


    public Warrior(String type, String name, int life, int strength) {
        super(type, name, life, strength);
    }


    @Override
    public int getMIN_Life() {
        return Warrior.MIN_LIFE;
    }

    @Override
    public int getMAX_Life() {
        return Warrior.MAX_LIFE;
    }

    @Override
    public int getMIN_Strength() {
        return Warrior.MIN_STRENGTH;
    }

    @Override
    public int getMAX_Strength() {
        return Warrior.MAX_STRENGTH;
    }


}

