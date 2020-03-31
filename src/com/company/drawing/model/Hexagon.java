package com.company.drawing.model;

public class Hexagon {
    private int lenght;

    private boolean selected;
    private Point center;

    public Hexagon(int lenght, Point center) {
        this.lenght = lenght;
        this.center = center;
    }

    public Hexagon(int lenght, boolean selected, Point center) {
        this(lenght,center);
        this.selected = selected;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
