package com.company.drawing.model;

import java.awt.*;

public abstract class Shape {

    protected boolean selected;

    public Shape() {}

    public abstract boolean contains (int x, int y);

    public abstract void draw (Graphics g);

    public Shape(boolean selected) {
        this.selected = selected;
    }
    public boolean isSelected() {
        return this.selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
