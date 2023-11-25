package ss9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

    public ArrayList<Nation> readFile() {
        ArrayList<Nation> readNation = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader ("F:/tester/demo/src/ss9/read");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                Nation nation = new Nation(Integer.parseInt(temp[0]), temp[1], temp[2]);
                readNation.add(nation);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        }
        return readNation;
    }

    public static void main(String[] args) {
        ReadCSV readCSV = new ReadCSV();
        System.out.println("Danh sách các quốc gia: ");
        System.out.println(readCSV.readFile());
    }
}
