package ss1;

import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args) {
        float chieurong;
        float chieucao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        chieurong = scanner.nextFloat();
        System.out.println("Nhập chiều cao: ");
        chieucao = scanner.nextFloat();
        float dientich = chieurong * chieucao;
        System.out.println("Diện tích hình chữ nhật là: " + dientich);
    }
}
