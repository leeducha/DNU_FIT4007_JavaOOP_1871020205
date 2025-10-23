package part6.strings;

import java.util.Scanner;

public class Example03CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        System.out.println("Số lượng ký tự trong chuỗi: " + s.length());
        sc.close();
    }
}
