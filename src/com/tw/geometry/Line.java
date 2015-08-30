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

    private boolean ifEndPointsAreEqualInterchangeably(Point thisLineP1, Point thisLineP2, Point thatLineP1, Point thatLineP2) {
        if (ifEndPointsAreEqual(thisLineP1, thisLineP2, thatLineP1, thatLineP2))
            return true;
        if (ifEndPointsAreEqual(thisLineP1, thisLineP2, thatLineP2, thatLineP1))
            return true;
        return false;
    }

    private boolean ifEndPointsAreEqual(Point thisLineStart, Point thisLineEnd, Point thatLineStart, Point thatLineEnd) {
        if (thisLineStart.equals(thatLineStart) && thisLineEnd.equals(thatLineEnd))
            return true;
        return false;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;
        Line thatLine = that instanceof Line ? (Line) that : null;
        if (thatLine != null)
            return ifEndPointsAreEqualInterchangeably(this.p1, this.p2, thatLine.p1, thatLine.p2);
        return false;
    }

    @Override
    public int hashCode() {
        Random generator1 = new Random(p1.hashCode());
        Random generator2 = new Random(p2.hashCode());
        return generator1.nextInt() * generator2.nextInt();
    }
}
