package com.tw.geometry;

import static java.lang.Math.*;

public class Line {

    private Point p1, p2;

    public Line(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public double length() {
        return p1.distanceFrom(p2);
    }

    @Override
    public boolean equals(Object that) {
        if(this == that)
            return true;
        if(that != null) {
            Line thatLine = that instanceof Line ? (Line) that : null;
            if (thatLine != null) {
                if (this.p1.equals(thatLine.p1) && this.p2.equals(thatLine.p2))
                    return true;
                if (this.p2.equals(thatLine.p1) && this.p1.equals(thatLine.p2))
                    return true;
            }
        }
        return false;
    }

}
