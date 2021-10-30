package vitalii.qa;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Hendalf", "mage", 1, 100, 15);
        mage.goToAdventures();
        mage.castSpell();
        mage.finishAdventure();

        TVbox tVbox = new TVbox(100, 90, 80, "PVH", "Panasonic", 1000);
        tVbox.turnOn();
        tVbox.setChannel1();
        tVbox.turnOff();
    }
}
