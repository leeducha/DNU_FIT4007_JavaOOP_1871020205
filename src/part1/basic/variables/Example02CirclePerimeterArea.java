package part1.basic.variables;
import java.util.Scanner;

public class Example02CirclePerimeterArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(2 * Math.PI * r);
        System.out.println(Math.PI * r * r);
    }
}
