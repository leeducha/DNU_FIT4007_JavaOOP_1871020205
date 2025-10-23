package part5.arrays;

import java.util.Scanner;

public class Example09CountEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) count++;
        }

        System.out.println("Số phần tử chẵn: " + count);
        sc.close();
    }
}
