package com.company.drawing.model;

public class Line {
    private Point startPoint;
    private Point endPoint;
    private boolean selected;

    public Line (Point startPoint,Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line (Point startPoint,Point endPoint, boolean selected){
        this(startPoint,endPoint);
        this.selected = selected;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public boolean isSelected() {
        return selected;
    }

    public double length(){
        return startPoint.distance(endPoint);
    }
}
