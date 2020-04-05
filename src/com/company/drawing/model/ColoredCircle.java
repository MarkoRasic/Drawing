package com.company.drawing.model;
import java.awt.*;

public class ColoredCircle extends Circle{
    private Color color;

    public ColoredCircle (Point center, int radius){
        super(center,radius);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
