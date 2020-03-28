package com.company.drawing.test;

import com.company.drawing.model.Circle;
import com.company.drawing.model.Line;
import com.company.drawing.model.Point;
import com.company.drawing.model.Rectangle;

public class TestGeometry {

    public static void main(String[] args) {
        Point p3 = new Point(5,6);

        Point p4 = new Point(10,20,true);

        Point p5 = p3;

        Point p6 = new Point(p3.getX(),p3.getY());



    }
}
