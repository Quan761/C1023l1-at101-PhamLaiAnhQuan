package ss2;

import java.util.Scanner;

public class tinhsocannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cannang, chieucao, bmi;
        System.out.println("Nhập số cân năng (kg): ");
        cannang = scanner.nextDouble();
        System.out.println("Nhập chiều cao (m): ");
        chieucao = scanner.nextDouble();
        bmi = cannang / Math.pow(chieucao,2);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25.0){
            System.out.println("Normal");
        }else if (bmi < 30.0){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
