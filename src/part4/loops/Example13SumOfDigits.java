package part4.loops;

import java.util.Scanner;

public class Example13SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Tổng các chữ số là: " + sum);
        sc.close();
    }
}
