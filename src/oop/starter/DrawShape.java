package oop.starter;

public abstract class DrawShape {
    private  final float width;
    private final float height;
    DrawShape(float width, float height){
        this.width = width;
        this.height = height;
    }
    protected void showParameters(){
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }
    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    abstract double calculateArea();
}
