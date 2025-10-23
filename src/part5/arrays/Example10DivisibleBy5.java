package part5.arrays;

import java.util.Scanner;

public class Example10DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean found = false;

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Các số chia hết cho 5: ");
        for (int x : a) {
            if (x % 5 == 0) {
                System.out.print(x + " ");
                found = true;
            }
        }

        if (!found) System.out.print("Không tồn tại phần tử nào chia hết cho 5");
        sc.close();
    }
}
