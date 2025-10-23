package part6.strings;

import java.util.Scanner;

public class Example05NormalizeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        s = s.trim().replaceAll("\\s+", " ");
        System.out.println("Chuỗi sau khi chuẩn hóa: \"" + s + "\"");
        sc.close();
    }
}
