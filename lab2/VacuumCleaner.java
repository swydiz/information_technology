package lab2;

class VacuumCleaner extends Appliances {
    private String type;
    private int power;
    private String control;

    public VacuumCleaner() {
        super();
    }

    //Конструктор
    public VacuumCleaner(String brand, String model, double price, String type, int power, String control) {
        super(brand, model, price);
        this.type = type;
        this.power = power;
        this.control = control;
    }
 
    //Переопределение
    @Override
    public void turnOn() {
        System.out.println("Пылесос: " + model + " - включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Пылесос: " + model + " - выключен");
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
    public void turnWetCleaning() {
        if (type != null && type.equalsIgnoreCase("Моющий")) {
        System.out.println("Включена влажная уборка");
    } else {
        System.out.println("Влажная уборка недоступна");
    }
    }

    public void selectPower() {
        System.out.println("Включен производительный режим, мощность увеличина до " + (power + 100) + " Вт");
    }

    //Геттеры и сеттеры
     public String getType() {
        return type;
    }

     public String getControl() {
        return control;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        }
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("Моющий") || type.equalsIgnoreCase("Обычный") ) {
            this.type = type;
        }
    }

    public void setControl(String control) {
        if (control.equalsIgnoreCase("Механическое") || control.equalsIgnoreCase("Дистанционное")) {
            this.control = control;
        }
    }

}

