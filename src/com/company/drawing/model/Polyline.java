package com.company.drawing.model;

import java.util.ArrayList;

public class Polyline {
    private ArrayList<Line> segments;

    public Polyline() {
        this.segments = new ArrayList<>();
    }

    public boolean addSegment(Line newSegment) {
        if (this.segments.isEmpty()) {
            return this.segments.add(newSegment);
        } else {
            Line lastSegment = this.segments.get(this.segments.size() - 1);
            if (lastSegment.getEndPoint().equals(newSegment.getStartPoint())) {
                return this.segments.add(newSegment);
            }
        }
        return false;
    }

    public double length() {
        double totalLength = 0;
        for (Line segment : this.segments) {
            totalLength += segment.length();
        }
        return totalLength;
    }
}
