package part6.strings;

import java.util.Scanner;

public class Example06CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        String s = sc.nextLine().trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();
        for (String w : words) {
            result.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1).toLowerCase())
                    .append(" ");
        }

        System.out.println("Chuỗi sau khi chuẩn hóa: " + result.toString().trim());
        sc.close();
    }
}
