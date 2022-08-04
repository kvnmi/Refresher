package oop.starter;

public class Rectangle extends DrawShape{
    Rectangle(float height, float width){
        super(height, width);
    }
    double calculateArea() {
        return  getHeight() * getWidth();
    }
}
