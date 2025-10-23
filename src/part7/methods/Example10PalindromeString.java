package part7.methods;

import java.util.Scanner;

public class Example10PalindromeString {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s) ? "Chuỗi đối xứng" : "Chuỗi không đối xứng");
        sc.close();
    }
}
