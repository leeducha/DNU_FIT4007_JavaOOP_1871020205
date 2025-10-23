package part2.conditional.statements;
import java.util.Scanner;

public class Example08CheckIntegerFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        if (a == (int)a) System.out.println("Là số nguyên");
        else System.out.println("Không phải số nguyên");
    }
}
