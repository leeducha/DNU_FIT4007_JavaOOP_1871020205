package part1.basic.variables;
import java.util.Scanner;

public class Example01SumDiffProductQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("Tổng = " + (a + b));
        System.out.println("Hiệu = " + (a - b));
        System.out.println("Tích = " + (a * b));
        System.out.println("Thương = " + ((float)a / b));
    }
}
