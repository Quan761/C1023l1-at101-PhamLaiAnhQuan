package ss3;

import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int num = scanner.nextInt();
        boolean check = true;
        if (num < 2){
            System.out.println("Số" + num + " không phải là số nguyên tố");
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Số " + num + " là nguyên tố");
        } else {
            System.out.println("Số " + num + " không phải là số nguyên tố");
        }
    }
}

