package vitalii.qa;

public class TVbox {
    private int length;
    private int width;
    private int height;
    private int prise;
    private int channel;
    private String material;
    private Boolean power;
    private Screen screen;

    public static String brand = "Samsung";
    public static String typeTv = "Цветной телевизор"; //это общие данные для всей программы, если изменить, то для всех обьектов.
    public static String typeAppliances = "Электроприбор";
    public static final String VOLTAGE = "220 вольт";

    static class Screen { //статик класс говорит нам что этот класс неотьемлемая часть общего класса
        int inch;
        String matrix;

        public void getInch() {
            System.out.println(inch);
        }

        public void setInch(int inch) {
            this.inch = inch;
        }

        public String getMatrix() {
            return matrix;
        }

        public void setMatrix(String matrix) {
            this.matrix = matrix;
        }
    }

    public TVbox(int length, int width, int height, String material, String brand, int prise, boolean power) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.prise = prise;
        this.power = power;
        TVbox.brand = brand;
    }

    public static void getTypeAppliances() {
        System.out.println(typeAppliances);
    }

    public static void setTypeAppliances(String typeAppliances) {
        TVbox.typeAppliances = typeAppliances;
    }

    public static void giveMeYourType() {
        System.out.println(typeTv);
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
        } else {
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

    public void getBrand() {
        System.out.println(brand);
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
