package oop.constructors;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    int age;

    public Dog(String name, int age) {
        super(name); // Gọi constructor của lớp cha
        this.age = age;
    }

    public void display() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
}

public class Example05SuperConstructor {
    public static void main(String[] args) {
        Dog dog = new Dog("Cún con", 3);
        dog.display();
    }
}
