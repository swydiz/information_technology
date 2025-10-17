package lab3;

import java.util.HashMap;

public class ProductAdd {
    private HashMap<Integer, Product> productMap;

    public ProductAdd() {
        productMap = new HashMap<>();
    }

    public void addProduct(int number, Product product) {
        productMap.put(number, product);
    }

    public Product findProduct(int number) {
        return productMap.get(number);
    }

    public void removeProduct(int number) {
        Product removedProduct = productMap.get(number);
        if (productMap.containsKey(number)) {
            productMap.remove(number);
            System.out.println("Продукт " + removedProduct + " удален");
        } else {
        System.out.println("Продукт " + removedProduct + " не найден"); }
    }

    public static void main(String[] args) {
        ProductAdd table = new ProductAdd();
        Product a = new Product("Шампунь", "для сухих волос", 300, 5);
        Product b = new Product("Пальто", "шерстяное", 10000, 2);

        table.addProduct(1233, a);
        table.addProduct(1533, b);

        System.out.println("Найден продукт: " + table.findProduct(1233));
        table.removeProduct(1233);
    }
}
