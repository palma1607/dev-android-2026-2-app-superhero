package br.com.unicuritiba.appsuperhero;

public class SuperHero {

    private int id;
    private String name;
    private String fullName;
    private int intelligence;
    private int power;
    private int speed;
    private int combat;
    private String image;

    public SuperHero(int id,
                     String name,
                     String fullName,
                     int intelligence,
                     int power,
                     int speed,
                     int combat,
                     String image) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.intelligence = intelligence;
        this.power = power;
        this.speed = speed;
        this.combat = combat;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCombat() {
        return combat;
    }

    public void setCombat(int combat) {
        this.combat = combat;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
