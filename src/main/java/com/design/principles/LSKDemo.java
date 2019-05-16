package com.design.principles;

class Rectangle {
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return " Width : " + this.width + " Height : " + this.height;
    }
}

class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}

public class LSKDemo {

    public static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Actual Area : " + rectangle.getArea());
        System.out.println("Expected Area : " + width * 10);

    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(2, 3);
        LSKDemo.useIt(rectangle);

        Rectangle square = new Square(2, 3);
        LSKDemo.useIt(square);

    }
}
