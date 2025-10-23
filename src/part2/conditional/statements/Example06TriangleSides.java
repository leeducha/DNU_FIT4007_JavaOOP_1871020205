package part2.conditional.statements;
import java.util.Scanner;

public class Example06TriangleSides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a)
            System.out.println("Là tam giác");
        else System.out.println("Không phải tam giác");
    }
}
