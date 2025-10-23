package part6.strings;

import java.util.Scanner;

public class Example07CountCharA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'A') count++;
        }

        System.out.println("Số lần xuất hiện ký tự 'a' hoặc 'A': " + count);
        sc.close();
    }
}
