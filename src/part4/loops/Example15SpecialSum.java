package part4.loops;

import java.util.Scanner;

public class Example15SpecialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (i + 1);
        }

        System.out.println("Tổng = " + sum);
        sc.close();
    }
}
