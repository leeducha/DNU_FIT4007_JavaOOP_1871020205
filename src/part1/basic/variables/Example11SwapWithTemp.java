package part1.basic.variables;
import java.util.Scanner;

public class Example11SwapWithTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = a; a = b; b = c;
        System.out.println(a + " " + b);
    }
}
