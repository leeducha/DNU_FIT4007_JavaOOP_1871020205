package part2.conditional.statements;
import java.util.Scanner;

public class Example07TriangleAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("Là tam giác");
        else System.out.println("Không phải tam giác");
    }
}
