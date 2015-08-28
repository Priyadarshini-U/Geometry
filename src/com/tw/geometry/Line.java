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
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    @Override
    public boolean equals(Object that) {
        if(this == that)
            return true;
        if(that == null)
            return false;
        Line thatLine = that instanceof Line ? (Line) that: null;
        if(thatLine != null){
            if(this.x1 == thatLine.x1 && this.x2 == thatLine.x2)
                return true;
            if(this.x1 == thatLine.x2 && this.x2 == thatLine.x1)
                return true;
            if(this.y1 == thatLine.y1 && this.y2 == thatLine.y2)
                return true;
        }
        return false;
    }

}
