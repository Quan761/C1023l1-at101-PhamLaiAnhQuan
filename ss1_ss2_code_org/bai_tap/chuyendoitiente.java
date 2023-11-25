package ss2;

import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rate = 23000f;
        float a, b;
        System.out.println("Khai báo giá trị USD:");
        a = scanner.nextFloat();
        b = a * rate;
        System.out.println("Giá trị VND là: " + b);
    }
}
