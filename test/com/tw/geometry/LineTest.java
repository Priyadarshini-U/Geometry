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
    public void shouldHaveActualLengthForLineParallelToXAxis() {
        assertEquals(1, new Line(1, 0, 1, 1).length(), 0.0);
    }

    @Test
    public void shouldHaveActualLengthForLineParallelToYAxis() {
        assertEquals(1, new Line(1, 1, 2, 1).length(), 0.0);
    }

    @Test
    public void shouldHaveActualLengthForLineNotParallelToXAndYAxis() {
        assertEquals(sqrt(2), new Line(1, 1, 2, 2).length(), 0.0);
    }

    @Test
    public void equalsItself() {
        Line line = new Line(1, 1, 2, 2);

        assertEquals(line, line);
    }

    @Test
    public void unequalsEmptyObject() {
        Line line = new Line(1, 1, 2, 2);

        assertNotEquals(line, null);
    }

    @Test
    public void unequalsInvalidObject() {
        Line line = new Line(1, 1, 2, 2);

        assertNotEquals(line, new Object());
    }

    @Test
    public void equalsLineWithSameXCoordinates() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(1, 1, 2, 2);

        assertEquals(line1, line2);
    }

}