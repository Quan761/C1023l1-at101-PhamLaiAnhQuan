package ss8;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleEdgesCheck check = new TriangleEdgesCheck();

        try {
            System.out.print("Nhập vào cạnh thứ nhất: ");
            int a = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ hai: ");
            int b = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ ba: ");
            int c = sc.nextInt();

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Tam giác không đúng định dạng.");
        }

        sc.close();
    }
}
