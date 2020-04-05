package com.company.drawing.model;

public class Circle {

    private Point center;
    private int radius;
    private boolean selected;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, int radius, boolean selected) {
        this(center, radius);
        this.selected = selected;
    }

    /*12*/
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = radius;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /*13*/
    public double area(){
        return (radius*radius)*Math.PI;
    }

    /*v6 *1*/
    public boolean contains (Point p){
        return (this.center.distance(p) <=this.radius);
    }

    /*v6 *2*/
    public boolean contains(int x, int y){
        return contains(new Point(x,y));
    }

    /*v7 *6*/
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Circle){
            Circle temp = (Circle) obj;
            if (this.center == temp.center && this.radius == temp.radius){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
