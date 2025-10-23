package part3.switchcase;

import java.util.Scanner;

public class Example02Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giới tính (0: Nam, 1: Nữ, 2: Khác): ");
        int gender = sc.nextInt();

        switch (gender) {
            case 0: System.out.println("Nam"); break;
            case 1: System.out.println("Nữ"); break;
            case 2: System.out.println("Khác"); break;
            default: System.out.println("Không hợp lệ!"); break;
        }
        sc.close();
    }
}
