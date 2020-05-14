package com.company.characters;

public class Mage extends Hero {
    public static final int MAX_Life = 6;
    public static final int MIN_Life = 3;
    public static final int MAX_Strength = 15;
    public static final int MIN_Strength = 8;

    public Mage() {
        super("Mage","Unknown Mage", MIN_Life, MIN_Strength, 0);
    }

//    public Mage(String name) {
//        super(name,5,5,0);
//
//    }
//
//    public Mage(String pickName, int pickLife, int pickStrength){
//        super(pickName,pickLife,pickStrength);
//
//    }
//

    public String toString() {
        return super.toString();
    }

    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMIN_Life(){
        return Mage.MIN_Life;
    }
    public int getMAX_Life(){
        return Mage.MAX_Life;
    }

    public int getMIN_Strength(){
        return Mage.MIN_Strength;
    }
    public int getMAX_Strength(){
        return Mage.MAX_Strength;
    }

}
