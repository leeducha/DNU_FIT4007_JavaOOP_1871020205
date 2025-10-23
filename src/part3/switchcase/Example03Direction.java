package part3.switchcase;

import java.util.Scanner;

public class Example03Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự hướng (N/S/E/W): ");
        char ch = sc.next().toUpperCase().charAt(0);

        switch (ch) {
            case 'N': System.out.println("Bắc"); break;
            case 'S': System.out.println("Nam"); break;
            case 'E': System.out.println("Đông"); break;
            case 'W': System.out.println("Tây"); break;
            default: System.out.println("Không hợp lệ!"); break;
        }
        sc.close();
    }
}
