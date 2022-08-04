package oop.starter;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle_1 = new Rectangle(12, 14);
        System.out.println(rectangle_1.calculateArea());
        DrawShape square_1 = new Square(10, 10);
        System.out.println(square_1.calculateArea());
        square_1.showParameters();
    }
}
