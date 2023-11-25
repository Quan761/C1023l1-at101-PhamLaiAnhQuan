package ss2;

import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập vào một năm: ");
        year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + " không phải là năm nhuận");
        }
    }
}
