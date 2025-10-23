package part1.basic.variables;
import java.util.Scanner;

public class Example05CalculateBirthYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(2023 - age);
    }
}
