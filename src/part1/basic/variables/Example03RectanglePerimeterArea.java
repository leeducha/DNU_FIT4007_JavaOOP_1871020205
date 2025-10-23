package part1.basic.variables;
import java.util.Scanner;

public class Example03RectanglePerimeterArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println(2 * (a + b));
        System.out.println(a * b);
    }
}
