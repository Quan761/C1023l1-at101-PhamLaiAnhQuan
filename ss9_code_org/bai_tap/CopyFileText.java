package ss9;

import java.io.*;

public class CopyFileText {

    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("F:/tester/demo/src/ss9/Text"));
            outStream = new FileOutputStream(new File("F:/tester/demo/src/ss9/Copy"));
            int length;
            byte[] buffer = new byte[1024];
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("Sao chép thành công.");
        }catch (FileNotFoundException e) {
            System.out.println("Tệp nguồn không tồn tại hoặc tập tin đích đã tồn tại.");
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
