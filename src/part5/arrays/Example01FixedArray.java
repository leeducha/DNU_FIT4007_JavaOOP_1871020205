package part5.arrays;

import java.util.Scanner;

public class Example01FixedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
