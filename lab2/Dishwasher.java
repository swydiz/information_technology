package lab2;

class Dishwasher extends Appliances {
    private int dishesNum;
    private String program;
    private double waterUse;

    public Dishwasher() {
        super();
    }

    //Конструктор
    public Dishwasher(String brand, String model, double price, int dishesNum, String program, double waterUse) {
        super(brand, model, price);
        this.dishesNum = dishesNum;
        this.program = program;
        this.waterUse = waterUse;
    }

    //Переопределение
    @Override
    public void turnOn() {
        System.out.println("Посудомоечная машина: " + model + " - включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Посудомоечная машина: " + model + " - выключена");
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
    public void selectProgram() {
         System.out.println("Выбрана программа: " + program);
    }

    public void overflow(int num) {
        if (num > dishesNum) {
            System.out.println("Посудомоечная машина переполнена");
        } else {
            System.out.println("Посудомоечная машина готова к запуску");
        }
    }
    
    //Геттеры и сеттеры
    public int getDishesNum() {
        return dishesNum;
    }

     public String getProgram() {
        return program;
    }

    public double getWaterUse() {
        return waterUse;
    }

    public void setDishesNum(int dishesNum) {
        if (dishesNum >= 0) {
            this.dishesNum = dishesNum;
        }
    }

    public void setProgram(String program) {
        if (program.equalsIgnoreCase("Стандартная") || program.equalsIgnoreCase("Интенсивная") || program.equalsIgnoreCase("Быстрая")) {
            this.program = program;
        }
    }

    public void setWaterUse(double waterUse) {
        if (waterUse >= 0) {
            this.waterUse = waterUse;
        }
    }

}
