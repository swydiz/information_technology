package lab2;

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
