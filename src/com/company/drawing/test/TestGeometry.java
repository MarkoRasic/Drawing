package com.company.drawing.test;

import com.company.drawing.model.*;

public class TestGeometry {

    public static void main(String[] args) {
        // Kreirati objekat klase Point sa inicijalnim koordinatama x=5, y=6 i i dodeliti ga
        // referenci p3.
        Point p3 = new Point(5,6);

        // Ispisati na konzolu vrednosti svih promenljivih tačke p3. Zašto obeležje selected
        // ima vrednost false?
        // Odgovor: selected ima vrednost false zato sto joj nismo dodelili vrednost prilikom kreiranja objekta, a podrazumevana
        // vrednost selected je false
        System.out.println((p3.getX()));
        System.out.println((p3.getY()));
        System.out.println((p3.isSelected()));

        // Kreirati objekat klase Point i dodeliti ga referenci p4. Pri tome inicijalizovati obeležja
        // x, y i selected na vrednosti 10, 20 i true, respektivno.
        Point p4 = new Point(10,20,true);

        // Postaviti obeležje selected tačke na koju ukazuje referenca p3 na trenutnu
        // vrednost obeležja selected tačke na koju ukazuje referenca p4.
        p3.setSelected(p4.isSelected());


        // Deklarisati referencu p5 tipa Point i dodeliti joj vrednost reference p3.
        Point p5 = p3;

        // Tački na koju ukazuje referenca p3 postaviti koordinatu x na vrednost 9. Potom
        // ispisati na konzolu vrednost x tačke na koju ukazuje referenca p5.
        p3.setX(9);
        System.out.println(p5.getX());

        // Kreirati novi objekat klase Point i dodeliti ga referenci p6. Prilikom poziva
        // konstruktora proslediti vrednosti koordinata x i y tačke na koju ukazuje referenca p3.
        Point p6 = new Point(p3.getX(),p3.getY());

        Hexagon hex = new Hexagon();
        hex.setLenght(9);
        System.out.println("Area of hexagon is " +hex.area());
    }
}
