package part1.basic.variables;
import java.util.Scanner;

public class Example10NextChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((char)(ch + 1));
    }
}
