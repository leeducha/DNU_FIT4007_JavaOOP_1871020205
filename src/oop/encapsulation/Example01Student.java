package oop.encapsulation;

public class Example01Student {
    // Thuộc tính private
    private String name;
    private int age;
    private double gpa;

    // Getter và Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Tuổi không hợp lệ!");
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4) this.gpa = gpa;
        else System.out.println("Điểm GPA không hợp lệ!");
    }

    public void display() {
        System.out.println("Họ tên: " + name + ", Tuổi: " + age + ", GPA: " + gpa);
    }

    public static void main(String[] args) {
        Example01Student s = new Example01Student();
        s.setName("Lê Đức Hà");
        s.setAge(18);
        s.setGpa(3.9);
        s.display();
    }
}
