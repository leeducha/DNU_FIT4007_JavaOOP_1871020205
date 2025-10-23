package part7.methods;

import java.util.Scanner;

public class Example06SumArray {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Tổng mảng = " + sumArray(a));
        sc.close();
    }
}
