package ss2;

import java.util.Scanner;

public class bt1sochansole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("x:");
        x = scanner.nextInt();
        if(x % 2 == 0){
            System.out.println("x là số chẵn");
        }else {
            System.out.println("x là số lẻ");
        }
    }
}
