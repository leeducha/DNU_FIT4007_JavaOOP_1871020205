package part2.conditional.statements;
import java.util.Scanner;

public class Example15NextMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt();
        m++;
        if (m == 60) { m = 0; h = (h + 1) % 24; }
        System.out.println(h + ":" + (m < 10 ? "0" + m : m));
    }
}
