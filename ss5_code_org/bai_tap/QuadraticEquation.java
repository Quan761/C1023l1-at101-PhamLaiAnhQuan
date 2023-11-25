package ss5;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4.0 * this.a * this.c;
    }

    public double getRoot1() {
        return this.getDiscriminant() < 0.0 ? 0.0 : (-this.b + Math.sqrt(this.getDiscriminant())) / (2.0 * this.a);
    }

    public double getRoot2() {
        return this.getDiscriminant() < 0.0 ? 0.0 : (-this.b - Math.sqrt(this.getDiscriminant())) / (2.0 * this.a);
    }
}
