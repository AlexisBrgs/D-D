package com.company.event.bonuses;

import com.company.characters.Hero;
import com.company.event.Event;

/**
 * Classe représentant les armes et potions : Fireball, Hammer, Little Potion, Super Potion, Sword, Thunder
 */
public abstract class Bonus implements Event {


    protected int life;
    protected int strength;

    /**
     * Constructeur prenant en paramètre la vie et la force, représentant tous les bonus dispo. Armes : seulement la force. Potions : Seulement la vie.
     * @param life int
     * @param strength int
     */
    public Bonus(int life, int strength) {
        this.life = life;
        this.strength = strength;
    }

    /**
     * Méthode permettant d'ajouter de la force ou de la vie au héro, tout en vérifiant son max / min avec la méthode setStrength/ setLife
     * @param h Hero
     */
    public void updateStats(Hero h) {
        h.updateStrength(this);
        h.updateLife(this);
    }

    public void interact(Hero h){
        System.out.println("---------------------------------------" +
                "\n IT IS A DROP PHASE LUCKY YOU, press enter !"
                + "\n---------------------------------------");
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

}











