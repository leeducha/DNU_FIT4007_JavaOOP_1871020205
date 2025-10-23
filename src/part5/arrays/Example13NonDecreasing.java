package part5.arrays;

import java.util.Scanner;

public class Example13NonDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        boolean nonDecreasing = true;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                nonDecreasing = false;
                break;
            }
        }

        System.out.println(nonDecreasing ? "Mảng không giảm" : "Mảng giảm");
        sc.close();
    }
}
