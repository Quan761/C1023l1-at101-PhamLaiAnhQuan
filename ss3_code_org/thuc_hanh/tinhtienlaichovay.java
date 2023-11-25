package ss3;

import java.util.Scanner;

public class tinhtienlaichovay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi:");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi:");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất:");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Lãi suất là: " + totalInterest);
    }
}
