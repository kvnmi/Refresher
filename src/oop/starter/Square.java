package oop.starter;

public class Square extends DrawShape{
    float height = getHeight();
    Square(float width, float height) {
        super(width, height);
    }
    double calculateArea() {
        return Math.pow(height, 2);
    }
}
