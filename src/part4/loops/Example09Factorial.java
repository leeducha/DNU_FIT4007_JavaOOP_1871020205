package part4.loops;

import java.util.Scanner;

public class Example09Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(n + "! = " + fact);
        sc.close();
    }
}
