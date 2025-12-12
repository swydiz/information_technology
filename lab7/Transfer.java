package lab7;

import java.util.*;

class Product {
    private int weight;

    public Product(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

class Storage {
    private List<Product> products = new ArrayList<>();
    private int currentLoad = 0; // сколько сейчас грузчики собрали
    private final int MAX_CAPACITY = 150;

    public Storage(List<Product> products) {
        this.products = products;
    }

    public synchronized Product takeProduct() {
        if (products.isEmpty()) return null;
        return products.remove(0);
    }

    public synchronized void addToLoad(int w) {
        currentLoad += w;
        System.out.println(Thread.currentThread().getName() +
                " взял " + w + " кг, сейчас собрано: " + currentLoad);

        if (currentLoad >= MAX_CAPACITY) {
            int savedValue = currentLoad;
            currentLoad = 0; 
            System.out.println(savedValue + " кг собрано!");
            currentLoad = 0;
            System.out.println("Грузчики вернулись");
        }
    }
}

class Worker extends Thread {
    private Storage storage;

    public Worker(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            Product p = storage.takeProduct();
            if (p == null) {
                System.out.println(Thread.currentThread().getName() +
                        " — товаров больше нет");
                break;
            }
            storage.addToLoad(p.getWeight());
        }
    }
}

public class Transfer {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        // создаём 20 товаров с разным весом
        for (int i = 0; i < 20; i++) {
            products.add(new Product(10 + (int)(Math.random()*20)));
        }

        Storage storage = new Storage(products);

        Worker w1 = new Worker(storage);
        Worker w2 = new Worker(storage);
        Worker w3 = new Worker(storage);

        w1.setName("Грузчик 1");
        w2.setName("Грузчик 2");
        w3.setName("Грузчик 3");

        w1.start();
        w2.start();
        w3.start();
    }
}