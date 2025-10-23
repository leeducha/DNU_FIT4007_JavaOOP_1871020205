package part1.basic.variables;
import java.util.Scanner;

public class Example08NameLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.length());
    }
}
