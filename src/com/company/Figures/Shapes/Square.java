package com.company.Figures.Shapes;

public class Square extends Rectangle{

    public Square(int size) {
        super(size, size);
    }

    public void setSize (int size){
        setWidth(size);
        setLength(size);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }
}
