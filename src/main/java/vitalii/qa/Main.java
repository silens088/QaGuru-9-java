package vitalii.qa;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Hendalf", "mage", 1, 100, 15);

        mage.goToAdventures();
        mage.castSpell();
        mage.finishAdventure();


    }
}
