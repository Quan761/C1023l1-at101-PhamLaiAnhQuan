package ss4;

import java.util.Scanner;

public class timgiatrinhonhattrongmang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Kích thước không được vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Các phần tử có trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] < min){
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min + " và ở vị trí thứ " + index);
    }
}
