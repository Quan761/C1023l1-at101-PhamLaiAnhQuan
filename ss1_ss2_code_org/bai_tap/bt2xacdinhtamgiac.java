package ss2;

import java.util.Scanner;

public class bt2xacdinhtamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhập 3 góc của tam giác:");
        System.out.println("a:");
        a = scanner.nextInt();
        System.out.println("b:");
        b = scanner.nextInt();
        System.out.println("c:");
        c = scanner.nextInt();
        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Tam giác này là tam giác đều");
        }else if (a == b + c || b == a + c || c == b + a){
            System.out.println("Tam giác này là tam giác vuông");
        }else if (a == b || b == c || c == a){
            System.out.println("Tam giác này là tam giác cân");
        }else if (a > 90 || b > 90 || c > 90) {
            System.out.println("Tam giác này là tam giác tù");
        }else if (a + b + c !=180) {
            System.out.println("Tam giác không hợp lệ");
        }else {
            System.out.println("Tam giác này là tam giác nhọn");
        }
    }
}
