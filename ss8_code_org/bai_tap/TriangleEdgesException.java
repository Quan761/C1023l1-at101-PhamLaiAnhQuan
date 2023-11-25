package ss8;

public class TriangleEdgesException extends Exception{
    public TriangleEdgesException(String str) {
        super(str);
    }
    public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Lỗi: Tam giác không đúng định dạng.");
        } else {
            System.out.println("Tam giác hợp lệ.");
        }
    }
}
