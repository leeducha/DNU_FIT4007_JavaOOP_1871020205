package oop.constructors;

public class Example03CopyConstructor {
    String model;
    int year;

    public Example03CopyConstructor(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Constructor sao chép
    public Example03CopyConstructor(Example03CopyConstructor other) {
        this.model = other.model;
        this.year = other.year;
    }

    public void display() {
        System.out.println("Model: " + model + ", Năm sản xuất: " + year);
    }

    public static void main(String[] args) {
        Example03CopyConstructor car1 = new Example03CopyConstructor("Toyota", 2023);
        Example03CopyConstructor car2 = new Example03CopyConstructor(car1);

        car1.display();
        car2.display();
    }
}
