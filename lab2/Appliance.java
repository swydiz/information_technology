package lab2;

import java.util.Scanner;

public class Appliance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Fridge fridge = new Fridge();
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        Dishwasher dishwasher = new Dishwasher();

        fridge.setBrand("LG");
        fridge.setModel("GN-B222SLC");
        fridge.setPrice(45000);
        fridge.setTemp(-18);
        fridge.setVolume(320);
        fridge.setProductsNum(15);

        vacuumCleaner.setBrand("Samsung");
        vacuumCleaner.setModel("VCC45S0S3R");
        vacuumCleaner.setPrice(25000);
        vacuumCleaner.setType("Моющий");
        vacuumCleaner.setPower(2000);
        vacuumCleaner.setControl("Дистанционное");

        dishwasher.setBrand("Bosch");
        dishwasher.setModel("SMV25AX00R");
        dishwasher.setPrice(38000);
        dishwasher.setDishesNum(12);
        dishwasher.setProgram("Интенсивная");
        dishwasher.setWaterUse(9.5);

        System.out.println("\nХолодильник");
        fridge.inf();
        System.out.println("Температура: " + fridge.getTemp() + "°C");
        System.out.println("Объем: " + fridge.getVolume() + " л");
        System.out.println("Продуктов: " + fridge.getProductsNum());
        fridge.productsCount();
        fridge.freeze("арбуз");
        fridge.freeze("арбуз", 5);


        System.out.println("\nПылесос");
        vacuumCleaner.inf();
        System.out.println("Тип: " + vacuumCleaner.getType());
        System.out.println("Мощность: " + vacuumCleaner.getPower() + " Вт");
        System.out.println("Управление: " + vacuumCleaner.getControl());
        vacuumCleaner.turnWetCleaning();
        vacuumCleaner.selectPower();

        System.out.println("\nПосудомоечная машина");
        dishwasher.inf();
        System.out.println("Количество посуды: " + dishwasher.getDishesNum() + " комплектов");
        System.out.println("Программа: " + dishwasher.getProgram());
        System.out.println("Расход воды: " + dishwasher.getWaterUse() + " л");
        dishwasher.selectProgram();
        dishwasher.overflow(12);
        System.out.println("\n");

        Appliances[] appliancesList = {fridge, vacuumCleaner, dishwasher};
        for (var i = 0; i < appliancesList.length; i++) {
            appliancesList[i].turnOff();
        }

        System.out.println("\nУстановите максимальное количество тарелок");
        int dishNum = console.nextInt();
        Dishwasher userDish = new Dishwasher();
         userDish.setBrand("Dyson");
         userDish.setModel("234-90F");
         userDish.setPrice(100000);
        userDish.setDishesNum(dishNum);
        userDish.setProgram("Интенсивная");
        userDish.setWaterUse(12);
        
        System.out.println("Объект создан");
        userDish.selectProgram();
        userDish.overflow(33);
        
        System.out.println("Всего создано объектов: " + Appliances.getAppliancesCount());
        console.close();
    }
}

