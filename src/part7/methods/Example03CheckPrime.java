package part7.methods;

import java.util.Scanner;

public class Example03CheckPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        System.out.println(isPrime(n) ? "Là số nguyên tố" : "Không phải số nguyên tố");
        sc.close();
    }
}
