package ss4;

import java.util.Scanner;

public class timgiatritrongmang {
    public static void main(String[] args) {
        String[] students = {"Anh", "Bảo", "Chi", "Linh", "Quốc"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên của học sinh: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí của học sinh " + name + " trong danh sách là: " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy " + name + " trong danh sách.");
        }
    }
}
