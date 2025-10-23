package part4.loops;

import java.util.Scanner;

public class Example10MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N (1–9): ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
        sc.close();
    }
}
