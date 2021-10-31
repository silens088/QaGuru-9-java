package vitalii.qa;

public class Main {
    public static void main(String[] args) {

        TVbox tVbox = new TVbox(100, 90, 80, "PVH", "Panasonic", 1000, false);

        tVbox.turnOn();
        tVbox.powerSupplyOn();
        tVbox.turnOn();
        tVbox.setChannel(2);
        tVbox.setChannel(4);
        tVbox.setChannel(8);
        tVbox.turnOff();
        tVbox.powerSupplyOff();


    }
}
