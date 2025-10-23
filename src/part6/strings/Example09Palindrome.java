package part6.strings;

import java.util.Scanner;

public class Example09Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        boolean palindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome ? "Chuỗi đối xứng" : "Chuỗi không đối xứng");
        sc.close();
    }
}
