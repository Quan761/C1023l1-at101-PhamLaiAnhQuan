package ss7;

import java.util.*;

public class ProductManager {

    private Scanner scanner = new Scanner(System.in);

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct() {
        int id;
        inputID:
        do {
            System.out.print("Nhập id sản phẩm: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id < 0) {
                    throw new NumberFormatException();
                }
                for (Product product : products) {
                    if (product.getId() == id) {
                        System.out.println("ID đã tồn tại");
                        continue inputID;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Id phải là số và lớn hơn 0 và nhỏ 2.147.483.647");
            }
        } while (true);
        String name;
        inputName: do {
            System.out.print("Nhập tên sản phẩm: ");
            name = scanner.nextLine().trim();
            if (!name.matches("^[\\p{L}0-9][\\p{L}0-9 ]{1,49}$")) {
                System.out.println("Nhập tên không đúng định dạng. Tên phải chứa ký tự chữ hoặc số hoặc dấu cách và có độ dài từ 2 => 50 ký tự");
            }else {
                String[] temp = name.split(" ");
                ArrayList<String> strings = new ArrayList<>();
                for(String str: temp) {
                    if(!str.equals(""))
                        strings.add(str);
                }
                String nameTemp = "";
                for(String str: strings) {
                    nameTemp+=str+" ";
                }
                nameTemp = nameTemp.trim();
                name = nameTemp;
                for (Product product : products) {
                    if (product.getName().toLowerCase().equals(name.toLowerCase())) {
                        System.out.println("Tên sản phẩm đã tồn tại");
                        continue inputName;
                    }
                }
                break;
            }
        } while (true);
        Product product = new Product(id, name);
        products.add(product);
        System.out.println("Thêm mới thành công");
        System.out.println("----------------------");
    }

    public void remove() {
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
    }

    public void display() {
        System.out.println("Danh sách sản phẩm có trong kho");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public void search() {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String name = scanner.nextLine();
        System.out.println("Danh sách sản phẩm cần tìm: ");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                System.out.println(products.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Chào mừng bạn đến với hệ thống của chúng tôi");
        int choice;
        do {
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("0. Thoát chương trình");
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productManager.display();
                    break;
                case 2:
                    productManager.addProduct();
                    break;
                case 3:
                    productManager.search();
                    break;
                case 4:
                    productManager.remove();
                    break;
                case 5:
                    System.exit(1);
            }
        } while (true);

    }
}
