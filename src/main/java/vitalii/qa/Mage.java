package vitalii.qa;

public class Mage {
    String name;
    String range;
    int level;
    int health;
    int fireDamage;


    Mage() {

    }

    public Mage(String name, String range, int level, int health, int fireDamage) {
        this.name = name;
        this.range = range;
        this.level = level;
        this.health = health;
        this.fireDamage = fireDamage;
    }

    public void castSpell() {
        System.out.println("You casting fireboll on" + fireDamage + " damage");
    }

    public void goToAdventures() {
        System.out.println("You go to adventures...");
    }

    public void finishAdventure() {
        System.out.println("go home..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }
}
