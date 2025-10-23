package part2.conditional.statements;
import java.util.Scanner;

public class Example01CheckNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) System.out.println("Là số tự nhiên");
        else System.out.println("Không phải số tự nhiên");
    }
}
