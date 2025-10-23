package oop.constructors;

public class Example01DefaultConstructor {
    String name;
    int age;

    // Constructor mặc định (không tham số)
    public Example01DefaultConstructor() {
        name = "No name";
        age = 0;
    }

    public void display() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }

    public static void main(String[] args) {
        Example01DefaultConstructor p = new Example01DefaultConstructor();
        p.display();
    }
}
