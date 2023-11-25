package ss1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println(" Giải phương trình bậc nhất có dạng 'a * x + b = c'");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        float a = scanner.nextFloat();
        System.out.println("b: ");
        float b = scanner.nextFloat();
        System.out.println("c: ");
        float c = scanner.nextFloat();
        float x = (c - b)/a;
        System.out.println("x= " + x);
    }
}
