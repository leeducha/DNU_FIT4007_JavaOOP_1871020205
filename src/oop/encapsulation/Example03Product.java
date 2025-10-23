package oop.encapsulation;

public class Example03Product {
    private String productName;
    private double price;
    private int quantity;

    public Example03Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValue() {
        return price * quantity;
    }

    public void display() {
        System.out.println(productName + " | Giá: " + price + " | SL: " + quantity + " | Tổng: " + totalValue());
    }

    public static void main(String[] args) {
        Example03Product p = new Example03Product("Laptop", 15000000, 2);
        p.display();
    }
}
