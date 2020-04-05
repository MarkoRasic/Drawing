package com.company.drawing.model;

public class Donut extends Circle {
    private int innerRadius;

    public Donut(Point center, int radius, int innerRadius) {
        super(center, radius);
        this.innerRadius = innerRadius;
    }


    public int getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double area(){
        return super.area() - this.innerRadius * this.innerRadius * Math.PI;
    }

    public boolean equals(Object obj){
        if(obj instanceof Donut){
            Donut temp = (Donut) obj;
            if(this.getCenter() == temp.getCenter() && this.innerRadius == temp.innerRadius){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
