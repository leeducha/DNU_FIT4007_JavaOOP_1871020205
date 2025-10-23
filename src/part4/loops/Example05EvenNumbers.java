package part4.loops;

import java.util.Scanner;

public class Example05EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
