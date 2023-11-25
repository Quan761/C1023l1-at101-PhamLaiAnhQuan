package ss3;

import java.util.Scanner;

public class hienthinumberssonguyentodautien {
    public static boolean isPrimeNumber(int numbers) {
        if (numbers < 2) {
            return false;
        }
        for (int N = 2; N <= Math.sqrt(numbers); N++) {
            if (numbers % N == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào numbers:");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (isPrimeNumber(N)) {
                System.out.println("Số nguyên tố là: " + N);
                count++;
            }
            N++;
        }
    }
}
