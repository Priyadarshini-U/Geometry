package com.tw.geometry;

import java.util.Random;

import static java.lang.Math.*;

public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(Point that){
        if(this == that)
            return 0.0;
        return sqrt( pow(that.x - this.x, 2) + pow(that.y - this.y, 2) );
    }

    @Override
    public boolean equals(Object that){
        if(this == that)
            return true;
        if(that != null) {
            Point thatPoint = that instanceof Point ? (Point) that : null;
            if (thatPoint != null)
                return (this.x == thatPoint.x) && (this.y == thatPoint.y);
        }
        return false;
    }

    @Override
    public int hashCode(){
        Random generator1 = new Random((long) x);
        Random generator2 = new Random((long) y);
        return generator1.nextInt() * generator1.nextInt();
    }
}
