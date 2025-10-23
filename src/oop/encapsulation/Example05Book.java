package oop.encapsulation;

public class Example05Book {
    private String title;
    private String author;
    private double price;

    public Example05Book() {}

    public Example05Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }

    public void display() {
        System.out.println("Sách: " + title + " | Tác giả: " + author + " | Giá: " + price);
    }

    public static void main(String[] args) {
        Example05Book b = new Example05Book("Java Cơ Bản", "Nguyễn Văn B", 95000);
        b.display();
    }
}
