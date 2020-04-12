package com.company.drawing.model;

import java.awt.*;

public class Circle extends Shape implements Movable {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        super();
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, int radius, boolean selected) {
        super(selected);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    public boolean contains(Point p) {
        return this.center.distance(p) <= this.radius;
    }

    public boolean contains(int x, int y) {
        return this.contains(new Point(x, y));
    }

    @Override
    public void draw(Graphics g) {

    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.center.equals(c.center) && this.radius == c.radius;
        }
        return false;
    }

    public String toString() {
        return "Center:" + this.center + ", Radius:" + this.radius;
    }

    @Override
    public void moveBy(int byX, int byY) {

    }
}