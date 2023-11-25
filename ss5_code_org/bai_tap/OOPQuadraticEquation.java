package ss5;

import java.util.Scanner;

public class OOPQuadraticEquation {
    public OOPQuadraticEquation() {
    }

    public static void main(String[] args) {
        System.out.println("Enter a,b,c: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() < 0.0) {
            System.out.println("The equation has no roots");
        } else if (qe.getDiscriminant() == 0.0) {
            System.out.println("The equation has one root: " + qe.getRoot1());
        } else {
            System.out.println("The equation has two roots: ");
            System.out.println("Delta is: " + qe.getDiscriminant());
            System.out.println("Root1 is: " + qe.getRoot1());
            System.out.println("Root2 is: " + qe.getRoot2());
        }
    }
}
