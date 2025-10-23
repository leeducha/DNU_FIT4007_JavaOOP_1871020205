package part2.conditional.statements;
import java.util.Scanner;

public class Example04MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a > b ? a : b);
    }
}
