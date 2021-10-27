package com.company.Figures.Shapes;

import com.company.Figures.Shape;

public class Rectangle extends Shape {
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    private int length;

    public String showInfo() {
        return this.length + " ; " + this.width;
    }
}
