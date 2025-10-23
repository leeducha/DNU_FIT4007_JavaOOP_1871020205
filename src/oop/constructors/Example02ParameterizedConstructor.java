package oop.constructors;

public class Example02ParameterizedConstructor {
    String name;
    double gpa;

    public Example02ParameterizedConstructor(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Sinh viên: " + name + " - GPA: " + gpa);
    }

    public static void main(String[] args) {
        Example02ParameterizedConstructor sv = new Example02ParameterizedConstructor("Lê Đức Hà", 3.8);
        sv.display();
    }
}
