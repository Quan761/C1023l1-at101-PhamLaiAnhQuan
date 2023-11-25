package ss6;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }

    public double[] getXY() {
        double[] out = {this.x, this.y};
        return out;
    }

    @Override
    public String toString() {
        return "+ position: (" + this.x + "," + this.y + ")" + "\n";
    }
}
