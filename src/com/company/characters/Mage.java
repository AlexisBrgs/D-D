package com.company.characters;

public class Mage {
    private String name;
    private String image;
    private Integer life;
    private Integer strength;

    public Mage() {
        name = "Unknown";
        image = "Unknown";
        life = 5;
        strength = 5;
    }

    public Mage(String pickName) {
        name = pickName;
        image = "Unknown";
        life = 5;
        strength = 5;
    }

    public Mage(String pickName, String pickImage, Integer pickLife, Integer pickStrength){
        name=pickName;
        image = pickImage;
        life = pickLife;
        strength = pickStrength;

    }

    public String toString(){
        return "[ Mage's name is : " + this.name
                + " | Image : " + this.image
                + " | Her.his current life is : " +this.life
                + " | Her.his strength is : " +this.strength
                + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
}
