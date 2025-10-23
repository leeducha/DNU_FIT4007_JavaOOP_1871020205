package part6.strings;

import java.util.Scanner;

public class Example01InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        System.out.println("Chuỗi vừa nhập: " + s);
        sc.close();
    }
}
