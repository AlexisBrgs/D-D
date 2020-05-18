package com.company.characters;

public class Warrior extends Hero {
    protected static final int MAX_Life = 10;
    protected static final int MIN_Life = 5;
    protected static final int MAX_Strength = 10;
    protected static final int MIN_Strength = 5;

    public Warrior() {
        super("Warrior", "Unknown Warrior", MIN_Life, MIN_Strength, 0);

    }

//    public Warrior(String name) {
//        super(name,5,5,0);
//    }
//
//    public Warrior(String name, int life, int strength, int attack){
//       super(name, life, strength, attack);
//    }



    @Override
    public int getMIN_Life() {
        return Warrior.MIN_Life;
    }

    @Override
    public int getMAX_Life() {
        return Warrior.MAX_Life;
    }

    @Override
    public int getMIN_Strength() {
        return Warrior.MIN_Strength;
    }

    @Override
    public int getMAX_Strength() {
        return Warrior.MAX_Strength;
    }


}

