package com.company.characters;

public class Mage extends Hero {
    protected static final int MAX_Life = 6;
    protected static final int MIN_Life = 3;
    protected static final int MAX_Strength = 15;
    protected static final int MIN_Strength = 8;

    public Mage() {
        super("Mage","Unknown Mage", MIN_Life, MIN_Strength);
    }
//
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

    @Override
    public int getMIN_Life(){
        return Mage.MIN_Life;
    }
    @Override
    public int getMAX_Life(){
        return Mage.MAX_Life;
    }
    @Override
    public int getMIN_Strength(){
        return Mage.MIN_Strength;
    }
    @Override
    public int getMAX_Strength(){
        return Mage.MAX_Strength;
    }

}
