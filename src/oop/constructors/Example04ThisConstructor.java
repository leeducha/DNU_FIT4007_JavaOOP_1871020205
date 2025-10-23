package oop.constructors;

public class Example04ThisConstructor {
    String name;
    int age;
    String address;

    public Example04ThisConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Example04ThisConstructor(String name, int age, String address) {
        this(name, age); // Gọi constructor khác
        this.address = address;
    }

    public void display() {
        System.out.println(name + " - " + age + " tuổi - Địa chỉ: " + address);
    }

    public static void main(String[] args) {
        Example04ThisConstructor person = new Example04ThisConstructor("Hà", 18, "Vĩnh Phúc");
        person.display();
    }
}
