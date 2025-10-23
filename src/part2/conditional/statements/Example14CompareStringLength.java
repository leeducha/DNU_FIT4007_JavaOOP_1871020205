package part2.conditional.statements;
import java.util.Scanner;

public class Example14CompareStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        if (a.length() >= b.length()) System.out.println(a);
        else System.out.println(b);
    }
}
