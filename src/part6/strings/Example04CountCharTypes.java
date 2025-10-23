package part6.strings;

import java.util.Scanner;

public class Example04CountCharTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        int lower = 0, upper = 0, digit = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) lower++;
            else if (Character.isUpperCase(c)) upper++;
            else if (Character.isDigit(c)) digit++;
        }

        System.out.println("Chữ thường: " + lower);
        System.out.println("Chữ hoa: " + upper);
        System.out.println("Chữ số: " + digit);
        sc.close();
    }
}
