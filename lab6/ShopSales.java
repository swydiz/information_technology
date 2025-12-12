package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sale> sales = new ArrayList<>();

        addSales(sc, sales);

        if (sales.isEmpty()) {
            System.out.println("Нет данных.");
            return;
        }

        printAllSales(sales);
        printTotalSum(sales);
        printMostPopular(sales);

        sc.close();
    }

    private static void addSales(Scanner sc, ArrayList<Sale> sales) {
        while (true) {
            System.out.print("Товар: ");
            String name = sc.nextLine().trim();
            if (name.isEmpty())
                break;

            System.out.print("Цена: ");
            double price = sc.nextDouble();

            System.out.print("Кол-во: ");
            int qty = sc.nextInt();
            sc.nextLine();

            sales.add(new Sale(name, price, qty));
        }
    }

    private static void printAllSales(ArrayList<Sale> sales) {
        System.out.println("\nВсе продажи:");
        for (Sale s : sales) {
            System.out.println(s);
        }
    }

    private static void printTotalSum(ArrayList<Sale> sales) {
        double total = 0;
        for (Sale s : sales)
            total += s.getTotal();
        System.out.printf("Итого: ", total);
    }

    private static void printMostPopular(ArrayList<Sale> sales) {
        Sale best = sales.get(0);
        for (Sale s : sales) {
            if (s.quantity > best.quantity ||
                    (s.quantity == best.quantity && s.getTotal() > best.getTotal())) {
                best = s;
            }
        }
        System.out.println("Лидер по количеству:");
        System.out.println(best);
    }
}