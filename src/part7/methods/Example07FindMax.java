package part7.methods;

import java.util.Scanner;

public class Example07FindMax {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
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

        System.out.println("Giá trị lớn nhất = " + findMax(a));
        sc.close();
    }
}
