package part7.methods;

import java.util.Scanner;

public class Example01SumTwoNumbers {
    // Hàm tính tổng
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("Tổng = " + sum(a, b));
        sc.close();
    }
}
