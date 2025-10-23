package part4.loops;

import java.util.Scanner;

public class Example07InputUntilPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập N (>0): ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Giá trị hợp lệ: " + n);
        sc.close();
    }
}
