package part3.switchcase;

import java.util.Scanner;

public class Example04Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.printf("%d + %d = %d\n", a, b, a + b); break;
            case '-': System.out.printf("%d - %d = %d\n", a, b, a - b); break;
            case '*': System.out.printf("%d * %d = %d\n", a, b, a * b); break;
            case '/':
                if (b != 0)
                    System.out.printf("%d / %d = %.2f\n", a, b, (double)a / b);
                else
                    System.out.println("Không thể chia cho 0!");
                break;
            case '%':
                if (b != 0)
                    System.out.printf("%d %% %d = %d\n", a, b, a % b);
                else
                    System.out.println("Không thể chia cho 0!");
                break;
            default:
                System.out.println("Phép tính không hợp lệ!");
        }
        sc.close();
    }
}
