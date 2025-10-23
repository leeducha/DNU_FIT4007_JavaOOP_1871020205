package part4.loops;

import java.util.Scanner;

public class Example04Sum1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
        sc.close();
    }
}
