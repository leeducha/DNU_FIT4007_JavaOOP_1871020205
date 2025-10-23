package part2.conditional.statements;
import java.util.Scanner;

public class Example05ValidScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        if (s >= 0 && s <= 10) System.out.println("Điểm hợp lệ");
        else System.out.println("Điểm không hợp lệ");
    }
}
