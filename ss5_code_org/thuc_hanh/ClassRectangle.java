package ss5;

public class ClassRectangle {
    double weight;
    double height;

    public ClassRectangle(){
    }

    public ClassRectangle(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getArea(){
        return this.weight * height;
    }

    public double getPerimeter(){
        return (this.weight + this.height) * 2;
    }

    public String display(){
        return "Hình chữ nhật {" + "chiều rộng = " + weight + ", chiều dài = " + height + "}";
    }
}
