package part2.conditional.statements;
import java.util.Scanner;

public class Example10DivisorMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a % b == 0 && b % c == 0)
            System.out.println("b vừa là ước của a, vừa là bội của c");
        else System.out.println("Không thỏa mãn");
    }
}
