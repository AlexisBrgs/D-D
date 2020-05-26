package com.company.characters;

import com.company.event.bonuses.Bonus;

/**
 * Classe abstraite heros permettant d'instancier un mage ou un guerrier
 */
public abstract class Hero {
    /**
     * Type du heros : Guerrier ou Mage
     */
    protected String type;
    /**
     * Nom du heros
     */
    protected String name;
    /**
     * Vie du heros
     */
    protected int life;
    /**
     * Force du heros (amazing hein)
     */
    protected int strength;

    /**
     * Constructeur de la classe heros avec tous les parametres
     * @param type String
     * @param name String
     * @param life int
     * @param strength int
     */
    public Hero(String type, String name, int life, int strength) {
        this.type = type;
        this.name = name;
        this.life = life;
        this.strength = strength;

    }

    /**
     *Affichae de toutes les stats du héro
     * @return
     */
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




    public int getLife() {
        return life;
    }

    /**
     * Verif de la vie en fonction du max et du mini propre a la classe du heros.
     * @param life int
     */
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

    /**
     * Verif de la force en fct du max et mini propre a la classe du heros
     * @param strength int
     */
    public void setStrength(int strength) {
        if (getMIN_Strength()<=strength && strength<=getMAX_Strength()){
            this.strength = strength;
        }
        else if (strength>getMAX_Strength()){
            this.strength=getMAX_Strength();
        }
        else {
            this.strength=getMIN_Strength();
        }
    }

    public void updateStrength(Bonus b){
        this.setStrength(this.getStrength()+ b.getStrength());
    }

    public void updateLife(Bonus b){
        this.setLife(this.getLife()+ b.getLife());
    }

    public void loseLife(int lostLife){
        if (lostLife>=this.life){
            this.life = 0;
        }
    else {
        this.life -= lostLife;
        }
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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