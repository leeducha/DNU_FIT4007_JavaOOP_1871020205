package part2.conditional.statements;
import java.util.Scanner;

public class Example02CheckSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (a == b) System.out.println("Là hình vuông");
        else System.out.println("Không phải hình vuông");
    }
}
