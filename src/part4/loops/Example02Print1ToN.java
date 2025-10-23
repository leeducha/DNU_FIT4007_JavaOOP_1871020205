package part4.loops;

import java.util.Scanner;

public class Example02Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
