package part7.methods;

import java.util.Scanner;

public class Example04ReverseNumber {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = sc.nextInt();

        System.out.println("Số đảo ngược: " + reverse(n));
        sc.close();
    }
}
