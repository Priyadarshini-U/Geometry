package com.tw.geometry;

import static java.lang.Math.*;

public class Line {

    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = y2;
        this.y2 = y2;
    }

    public double length() {
        if(x1 == x2)
            return abs(y2 - y1);
        return 0;
    }

}
