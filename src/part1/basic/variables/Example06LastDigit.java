package part1.basic.variables;
import java.util.Scanner;

public class Example06LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        System.out.println(n % 10);
    }
}
