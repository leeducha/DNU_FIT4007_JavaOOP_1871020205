package oop.encapsulation;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) salary += salary * percent / 100;
    }

    public void display() {
        System.out.println("Nhân viên: " + name + " | Lương: " + salary);
    }
}

public class Example04AccessControl {
    public static void main(String[] args) {
        Employee e = new Employee("Trần Văn A", 8000000);
        e.display();
        e.raiseSalary(10);
        e.display();
    }
}
