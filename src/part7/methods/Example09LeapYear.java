package part7.methods;

import java.util.Scanner;

public class Example09LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int year = sc.nextInt();

        System.out.println(isLeapYear(year) ? "Là năm nhuận" : "Không phải năm nhuận");
        sc.close();
    }
}
