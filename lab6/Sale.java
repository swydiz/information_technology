package lab6;

public class Sale {
        String productName;
        double price;
        int quantity;

        public Sale(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Товар: " + productName +
                    ", цена: " + price + " руб." +
                    ", количество: " + quantity + " шт." +
                    ", сумма: " + (price * quantity) + " руб.";
        }

        public double getTotal() {
            return price * quantity;
        }
    }
