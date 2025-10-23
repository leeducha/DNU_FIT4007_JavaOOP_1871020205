package part1.basic.variables;
import java.util.Scanner;

public class Example12SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
