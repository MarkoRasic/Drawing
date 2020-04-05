package com.company.drawing.model;

public class ColoredCircleWithText extends Circle{
    private String text;

    public ColoredCircleWithText (Point center, int radius){
        super(center,radius);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
