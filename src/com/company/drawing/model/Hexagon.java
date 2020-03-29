package com.company.drawing.model;

public class Hexagon {
    private int lenght;
    private boolean isSelected;
    private Point center;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double area() {
        int triangle = 3;
        return (((triangle * Math.sqrt(3))/2) * (this.lenght * this.lenght));
    }
}
