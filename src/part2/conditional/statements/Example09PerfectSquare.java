package part2.conditional.statements;
import java.util.Scanner;

public class Example09PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sqrt = Math.sqrt(n);
        if (sqrt == (int)sqrt) System.out.println("Số chính phương");
        else System.out.println("Không phải số chính phương");
    }
}
