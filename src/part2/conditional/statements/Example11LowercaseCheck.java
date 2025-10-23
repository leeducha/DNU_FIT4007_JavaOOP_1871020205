package part2.conditional.statements;
import java.util.Scanner;

public class Example11LowercaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') System.out.println("Chữ thường");
        else System.out.println("Không phải chữ thường");
    }
}
