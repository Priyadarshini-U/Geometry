package com.tw.geometry;

import static java.lang.Math.*;

public class Line {

    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return sqrt( squareOfDifference(x2, x1) + squareOfDifference(y2, y1) );
    }

    private double squareOfDifference(double value1, double value2) {
        return pow(value2 - value1, 2);
    }

    private boolean comparePoints(double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2)
            return true;
        return false;
    }

    @Override
    public boolean equals(Object that) {
        if(this == that)
            return true;
        if(that != null) {
            Line thatLine = that instanceof Line ? (Line) that : null;
            if (thatLine != null) {
                if (comparePoints(x1, y1, thatLine.x1 ,thatLine.y1) && comparePoints(x2, y2, thatLine.x2, thatLine.y2))
                    return true;
                if (comparePoints(x2, y2, thatLine.x1 ,thatLine.y1) && comparePoints(x1, y1, thatLine.x2, thatLine.y2))
                    return true;
            }
        }
        return false;
    }

}
