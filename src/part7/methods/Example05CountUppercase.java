package part7.methods;

import java.util.Scanner;

public class Example05CountUppercase {
    public static int countUpper(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        System.out.println("Số ký tự in hoa: " + countUpper(s));
        sc.close();
    }
}
