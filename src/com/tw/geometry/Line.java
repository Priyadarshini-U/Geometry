package com.tw.geometry;

import java.util.Random;

public class Line {
    private Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return p1.distanceFrom(p2);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;
        if (that != null) {
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

    @Override
    public int hashCode() {
        Random generator1 = new Random(p1.hashCode());
        Random generator2 = new Random(p2.hashCode());
        return generator1.nextInt() * generator2.nextInt();
    }
}
