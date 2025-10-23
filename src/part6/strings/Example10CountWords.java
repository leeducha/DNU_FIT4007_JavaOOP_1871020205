package part6.strings;

import java.util.Scanner;

public class Example10CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Chuỗi rỗng!");
        } else {
            String[] words = s.split("\\s+");
            System.out.println("Số lượng từ trong chuỗi: " + words.length);
        }
        sc.close();
    }
}
