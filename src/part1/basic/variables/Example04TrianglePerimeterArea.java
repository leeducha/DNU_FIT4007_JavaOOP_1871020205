package part1.basic.variables;
import java.util.Scanner;

public class Example04TrianglePerimeterArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double p = (a + b + c) / 2;
        System.out.println(a + b + c);
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
