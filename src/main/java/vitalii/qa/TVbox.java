package vitalii.qa;

public class TVbox {
    int length;
    int width;
    int height;
    String material;
    String brand;
    int prise;

    public TVbox(int length, int width, int height, String material, String brand, int prise) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.brand = brand;
        this.prise = prise;
    }

    public void turnOn() {
        System.out.println("Включился");
    }

    public void turnOff() {
        System.out.println("Выключился");
    }

    public void setChannel1() {
        System.out.println("Включился первый канал");
    }
}
