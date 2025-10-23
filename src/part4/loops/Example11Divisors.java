package part4.loops;

import java.util.Scanner;

public class Example11Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        System.out.print("Các ước số của " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
