package com.tw.geometry;

import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.Math.*;


public class LineTest {

    @Test
    public void shouldHaveLengthZeroForLineWithSameCoordinates() {
        assertEquals(0, new Line(0, 0, 0, 0).length(), 0.0);
    }

    @Test
    public void shouldHaveActualLengthLineParallelXAxis() {
        assertEquals(1, new Line(1, 0, 1, 1).length(), 0.0);
    }

}