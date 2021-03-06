package com.company.drawing.test;


import com.company.drawing.model.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TestGeometry {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        System.out.println(p1.distance(p2));

        Circle c = new Circle(null, 3);
        System.out.println(c.area());

        Rectangle r = new Rectangle(null, 6, 4);
        System.out.println(r.area());

        // vezba 5
        Point p3 = new Point(5, 6);
        System.out.println("x=" + p3.getX() + ", y=" + p3.getY() + ", selected=" + p3.isSelected());

        Point p4 = new Point(10, 20, true);
        p3.setSelected(p4.isSelected());

        Point p5 = p3;
        p3.setX(9);
        System.out.println(p5.getX());

        Point p6 = new Point(p3.getX(), p3.getY());
/*
        System.out.println("Upisite parametre za kreiranje tacke:");
        Scanner scanner = new Scanner(System.in);
        String pointInput = scanner.nextLine();
        String[] coordinates = pointInput.split(" ");
        int inputX = Integer.parseInt(coordinates[0]);
        int inputY = Integer.parseInt(coordinates[1]);
        boolean selected = false;
        if (coordinates.length == 3) {
            selected = Boolean.parseBoolean(coordinates[2]);
        }
        Point pointFromInput = new Point(inputX, inputY, selected);
        System.out.println("x=" + pointFromInput.getX() + ", y=" + pointFromInput.getY() + ", selected=" + pointFromInput.isSelected());
        Donut d1 = new Donut(new Point(10, 20), 30, 20);
        Donut d2 = new Donut(new Point(10, 20), 30, 20);
        System.out.println(d1.equals(d2));
        Point[] arrayOfPoints = {p1, p2, p5};
        for (Point point : arrayOfPoints) {
            System.out.println(point);
        }
        ArrayList<Point> listOfPoints = new ArrayList<>();
        listOfPoints.add(p5);
        listOfPoints.add(p1);
        for (Point point : listOfPoints) {
            System.out.println(point);
        }
        */
//        Circle cstr = new Circle(new Point(10, 20), 30);
//        System.out.println(cstr);
/*
        Polyline pll = new Polyline();
        pll.addSegment(l1);
        //...
        if (!pll.addSegment(l5)) {
            System.out.println("Neuspesno dodavanje segmenta u poliliniju");
        }
 */



        ArrayList<Shape> shapes = new ArrayList<>();

        Point tacka1 = new Point(100, 200);
        Line linija1 = new Line(new Point(118, 150), new Point(100, 200));
        Circle krug1 = new Circle(new Point(50, 60), 60);
        Rectangle pravoug1 = new Rectangle(new Point(100, 200), 300, 200);

        shapes.add(tacka1);
        shapes.add(linija1);
        shapes.add(krug1);
        shapes.add(pravoug1);


        for(Shape shape : shapes) {
            System.out.println(shape.contains(100, 200));
        }

    }
}
