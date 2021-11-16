package vitalii.qa;

public class Main {
    public static void main(String[] args) {

        TVbox tVbox = new TVbox(100, 90, 80, "PVH", "Panasonic", 1000, false);
        TVbox.Screen screen = new TVbox.Screen(); //статический класс

        tVbox.turnOn();
        tVbox.powerSupplyOn();
        tVbox.turnOn();
        tVbox.setChannel(2);
        tVbox.setChannel(4);
        tVbox.setChannel(8);
        tVbox.turnOff();
        tVbox.powerSupplyOff();
        tVbox.setBrand("Samsung");
        tVbox.getBrand();

        TVbox.giveMeYourType(); //статиеский метод вызывается через класс.
        TVbox.setTypeAppliances("Домашний электроприбор");
        TVbox.getTypeAppliances();

        System.out.println(TVbox.VOLTAGE);

        screen.setInch(12); //статический класс
        screen.getInch();

    }
}

// Заметка1:
// static - это метод который не привязан ни к чему. Можно вызвать ото всюду.
// метод static - не привязан к конкретному обьекту того класса в котором он написан.
// правильно вызывать статический метод по имени класса.
// Общие данные - статические
// вложенный статик класс Human head