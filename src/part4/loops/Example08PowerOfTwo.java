package part4.loops;

import java.util.Scanner;

public class Example08PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        boolean isPowerOfTwo = false;
        int val = 1;
        while (val <= n) {
            if (val == n) {
                isPowerOfTwo = true;
                break;
            }
            val *= 2;
        }

        System.out.println(n + (isPowerOfTwo ? " là lũy thừa của 2" : " không phải lũy thừa của 2"));
        sc.close();
    }
}
