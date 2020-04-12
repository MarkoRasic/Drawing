package com.company.drawing.model;

import java.awt.*;

public class Line extends Shape implements Movable {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        super();
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(Point startPoint, Point endPoint, boolean selected) {
        super(selected);
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public double length() {
        return this.startPoint.distance(this.endPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  Line) {
            Line l = (Line) obj;
            return this.startPoint.equals(l.startPoint);
        }
        return false;
    }

    public String toString() {
        return "Start:" + this.startPoint + ", End:" + this.endPoint;
    }

    public boolean contains(Point p) {
        return this.startPoint.distance(p) + this.endPoint.distance(p) - this.length() <= 3.0D;
    }

    @Override
    public boolean contains(int x, int y) {
        return false;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public void moveBy(int byX, int byY) {

    }
}
