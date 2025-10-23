package part2.conditional.statements;
import java.util.Scanner;

public class Example12UppercaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') System.out.println("Chữ hoa");
        else System.out.println("Không phải chữ hoa");
    }
}