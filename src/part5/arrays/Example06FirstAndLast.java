package part5.arrays;

import java.util.Scanner;

public class Example06FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Phần tử đầu: " + a[0]);
        System.out.println("Phần tử cuối: " + a[n - 1]);
        sc.close();
    }
}
