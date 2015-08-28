package com.tw.geometry;

import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.Math.*;

public class LineTest {

    Line line1 = new Line(1, 1, 2, 2);
    Line line2 = new Line(1, 1, 2, 2);

    @Test
    public void shouldHaveLengthZeroForLineWithSameCoordinates() {
        Line line = new Line(0, 0, 0, 0);

        assertEquals(0, line.length(), 0.0);
    }

    @Test
    public void shouldHaveActualLengthForLineParallelToXAxis() {
        Line line = new Line(1, 0, 1, 1);

        assertEquals(1, line.length(), 0.0);
    }

    @Test
    public void shouldHaveActualLengthForLineParallelToYAxis() {
        Line line = new Line(1, 1, 2, 1);

        assertEquals(1, line.length(), 0.0);
    }

    @Test
    public void shouldHaveActualLengthForLineNotParallelToXAndYAxis() {
        Line line = new Line(1, 1, 2, 2);

        assertEquals(sqrt(2), line.length(), 0.0);
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

    @Test
    public void equalsLineWithSameXCoordinatesWithOrderReversed() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 2, 1, 1);

        assertEquals(line1, line2);
    }

    @Test
    public void equalsLineWithSameYCoordinates() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 2, 1, 1);

        assertEquals(line1, line2);
    }

    @Test
    public void equalsLineWithSameYCoordinatesWithOrderReversed() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 2, 1, 1);

        assertEquals(line1, line2);
    }

    @Test
    public void equalsLineWithSameYAndYCoordinates() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 2, 1, 1);

        assertEquals(line1, line2);
    }

    @Test
    public void equatesLine() {
        assertEquals(line1, line2);
    }

    @Test
    public void equalsLineThatEquatesToThisPoint() {
        assertEquals(line1, line2);
    }

    @Test
    public void equalsHashCodeWithSameLine() {
        assertEquals(line1.hashCode(), line1.hashCode());
    }

    @Test
    public void equalsHashCodeWithSimilarAndEqualLine() {
        assertEquals(line1.hashCode(), line2.hashCode());
    }
}