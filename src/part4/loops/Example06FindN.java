package part4.loops;

import java.util.Scanner;

public class Example06FindN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập S: ");
        int s = sc.nextInt();

        int sum = 0, n = 0;
        while (sum + n + 1 <= s) {
            n++;
            sum += n;
        }

        System.out.println("Số N nhỏ nhất là: " + n);
        sc.close();
    }
}
