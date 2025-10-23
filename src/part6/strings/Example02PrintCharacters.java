package part6.strings;

import java.util.Scanner;

public class Example02PrintCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        System.out.println("Từng ký tự trong chuỗi:");
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Ký tự " + i + ": " + s.charAt(i));
        }
        sc.close();
    }
}
