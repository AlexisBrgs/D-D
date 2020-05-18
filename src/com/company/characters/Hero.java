package com.company.characters;

public abstract class Hero {

    protected String type;
    protected String name;
    protected int life;
    protected int strength;


    public Hero(String type, String name, int life, int strength) {
        this.type = type;
        this.name = name;
        this.life = life;
        this.strength = strength;

    }


    public String toString() {
        return "---------------------------------------"
                + "\n                RECAP"
                + "\n---------------------------------------"
                + "\n - You are a " + this.type + "."
                + "\n - Your name is " + this.name + "."
                + "\n - You have " + this.life + " HP."
                + "\n - You have " + this.strength + " of strength."
                + "\n---------------------------------------";
    }

//    public Hero (String name){
//        this(name,0,0,0);
//    }
//
//    public Hero(){
//   this("Unknown", 0,0,0);
//    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        if (getMIN_Life()<=life && life<=getMAX_Life()){
            this.life = life;
        }
        else if (life>getMAX_Life()){
            this.life=getMAX_Life();
        }
        else {
            this.life=getMIN_Life();
        }
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (getMIN_Strength()<=strength && strength<=getMAX_Life()){
            this.strength = strength;
        }
        else if (strength>getMAX_Life()){
            this.strength=getMAX_Life();
        }
        else {
            this.strength=getMIN_Strength();
        }
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public abstract int getMIN_Life();
    public abstract int getMAX_Life();


    public abstract int getMIN_Strength();
    public abstract int getMAX_Strength();
}