package part4.loops;

import java.util.Scanner;

public class Example12PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        boolean isPrime = n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(n + (isPrime ? " là số nguyên tố" : " không phải số nguyên tố"));
        sc.close();
    }
}
