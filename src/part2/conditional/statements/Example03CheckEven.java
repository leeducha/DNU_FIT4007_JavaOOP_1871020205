package part2.conditional.statements;
import java.util.Scanner;

public class Example03CheckEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println("Số chẵn");
        else System.out.println("Số lẻ");
    }
}
