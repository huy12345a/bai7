package baitaptrienkhaiinterface;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Circle(3);
        for (Shape s : shapes) {
            System.out.println("Sbandau = " +s.getArea());
            Random r = new Random();
            double percent = r.nextDouble() * 1;
            System.out.println("% =" + percent);
            ((Resizeable) s).resize(percent);
            System.out.println("Sthaydoi = " + s.getArea());
        }
    }
}
