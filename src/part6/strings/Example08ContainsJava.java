package part6.strings;

import java.util.Scanner;

public class Example08ContainsJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        if (s.toLowerCase().contains("java"))
            System.out.println("Chuỗi có chứa từ 'Java'");
        else
            System.out.println("Chuỗi KHÔNG chứa từ 'Java'");
        sc.close();
    }
}
