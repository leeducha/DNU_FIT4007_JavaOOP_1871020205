package part5.arrays;

import java.util.Scanner;

public class Example08MaxAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        int max = a[0], count = 0;
        for (int x : a) {
            if (x > max) max = x;
        }
        for (int x : a) {
            if (x == max) count++;
        }

        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Số lượng phần tử có giá trị này: " + count);
        sc.close();
    }
}
