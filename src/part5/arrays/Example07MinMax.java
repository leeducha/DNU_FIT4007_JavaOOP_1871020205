package part5.arrays;

import java.util.Scanner;

public class Example07MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        int max = a[0], min = a[0];
        for (int x : a) {
            if (x > max) max = x;
            if (x < min) min = x;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        sc.close();
    }
}
