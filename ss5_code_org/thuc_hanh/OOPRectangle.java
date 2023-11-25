package ss5;

import java.util.Scanner;

public class OOPRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        double weight = scanner.nextDouble();
        System.out.println("Nhập chiều dài: ");
        double height = scanner.nextDouble();
        ClassRectangle rectangle = new ClassRectangle(weight, height);
        System.out.println("Hình chữ nhật: " + rectangle.display());
        System.out.println("Chu vi của hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích của hình chữ nhật: " + rectangle.getArea());
    }
}
