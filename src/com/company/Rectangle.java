package com.company;

public class Rectangle extends Shape {
    private int length;
    private int width;
    public Rectangle( int length, int width)
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea()
    {
        return (length*width);
    }

    @Override
    public double getPerimeter()
    {
        return (length*2) + (width*2);
    }
}
