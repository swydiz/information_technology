package lab2;

public abstract class Appliances {
    protected String brand;
    protected String model;
    protected double price;

     // Статическая переменная для подсчета созданных объектов
    private static int appliancesCount = 0;

    // Конструктор по умолчанию
    public Appliances() {
        appliancesCount++;
    }

    // Конструктор с параметрами
    public Appliances(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        appliancesCount++;
    }

    // Абстрактные методы
    public abstract void turnOn();
    public abstract void turnOff();


    //Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public static int getAppliancesCount() {
        return appliancesCount;
    }

    //Методы
    public void inf() {
        System.out.println("Компания: " + brand + "Модель: " + model + "Цена: " + price);
    }

    public void crush() {
        System.out.println(brand + " " + model + " не работает");
    }
}

class Fridge extends Appliances {
    private double temp;
    private int productsNum;
    private double volume;

    public Fridge() {
        super();
    }

    //Конструктор
    public Fridge(String brand, String model, double price, double temp, double volume) {
        super(brand, model, price);
        this.temp = temp;
        this.productsNum = 0;
        this.volume = volume;
    }

    //Переопределение методов
    @Override
    public void turnOn() {
        System.out.println("Холодильник: " + model + " - включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Холодильник: " + model + " - выключен");
    }

    @Override
    public void inf() {
       System.out.println("Компания: " + brand + " Модель: " + model + " Цена: " + price);
    }

    @Override
    public void crush() {
        System.out.println(brand + " " + model + " не работает");
    }

    //Методы
    public void productsCount() {
        productsNum++;
        System.out.println("В холодильнике: " + model + " количестов продуктов:" + productsNum);
    }

    //Статический полиморфизм
    public void freeze(String product) {
        System.out.println("Холодильник: " + model + " заморозил продукт: " + product);
    }

     public void freeze(String product, double time) {
        System.out.println("Холодильник: " + model + " заморозил продукт: " + product + " за " + time + " минут");
    }
    
    //Геттеры и сеттеры
    public double getTemp() {
        return temp;
    }

    public double getVolume() {
        return volume;
    }

    public int getProductsNum() {
        return productsNum;
    }

    public void setTemp(double temp) {
        if (temp <= 0) {
            this.temp = temp;
        }
    }

    public void setVolume(double volume) {
        if (volume >= 0) {
            this.volume = volume;
        }
    }

    public void setProductsNum(int productsNum) {
        if (productsNum >= 0) {
            this.productsNum = productsNum;
        }
    }
}
