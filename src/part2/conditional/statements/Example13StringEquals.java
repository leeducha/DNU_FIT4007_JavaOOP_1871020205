package part2.conditional.statements;
import java.util.Scanner;

public class Example13StringEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        if (a.equals(b)) System.out.println("Hai chuỗi giống nhau");
        else System.out.println("Hai chuỗi khác nhau");
    }
}
