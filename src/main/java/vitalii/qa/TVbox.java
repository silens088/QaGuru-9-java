package vitalii.qa;

public class TVbox {
    int length;
    int width;
    int height;
    int prise;
    int channel;
    String material;
    String brand;
    Boolean power;

    public TVbox(int length, int width, int height, String material, String brand, int prise, boolean power) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.brand = brand;
        this.prise = prise;
        this.power = power;
    }


    public void powerSupplyOn() {
        setPower(true);
        System.out.println("Электропинтание включено");
    }

    public void powerSupplyOff() {
        setPower(false);
        System.out.println("Электропинтание выключено");
    }

    public void turnOn() {
        if (power == true) {
            this.channel = 1;
            System.out.println("Телевизор Включился. " + "Канал: " + channel);
        }
        else {
            System.out.println("Ничего не происходит");
        }

    }

    public void turnOff() {

        System.out.println("Телевизор Выключился");
    }

    public void setChannel(int x) {
        this.channel = x;
        System.out.println("Включился канал: " + x);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }
}
