package com.tw.geometry;

import org.junit.Test;

import static java.lang.Math.sqrt;
import static org.junit.Assert.*;

public class PointTest {
    Point point1 = new Point(1, 2);
    Point point2 = new Point(1, 2);

    @Test
    public void shouldHaveDistanceZeroForItself() {
        Point point = new Point(0, 0);

        assertEquals(0, point.distanceFrom(point), 0.0);
    }

    @Test
    public void shouldHaveActualDistanceFromAnotherPointDisplacedInXAxis() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 1);

        assertEquals(1, point1.distanceFrom(point2), 0.0);
    }

    @Test
    public void shouldHaveActualDistanceFromAnotherPointDisplacedInYAxis() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 0);

        assertEquals(1, point1.distanceFrom(point2), 0.0);
    }

    @Test
    public void shouldHaveActualDistanceFromAnotherPointDisplacedInXAndYAxis() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 1);

        assertEquals(sqrt(2), point1.distanceFrom(point2), 0.0);
    }

    @Test
    public void equalsItself() {
        Point point = new Point(0, 0);

        assertEquals(point, point);
    }

    @Test
    public void unequalsEmptyObject() {
        Point point = new Point(0, 0);

        assertNotEquals(point, null);
    }

    @Test
    public void unequalsInvalidObject() {
        Point point = new Point(0, 0);

        assertNotEquals(point, new Object());
    }

    @Test
    public void equalsPointWithSameXCoordinates() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        assertEquals(point1, point2);
    }

    @Test
    public void equalsPointWithSameYCoordinates() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        assertEquals(point1, point2);
    }

    @Test
    public void equalsPointWithSameYAndYCoordinates() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        assertEquals(point1, point2);
    }

    @Test
    public void equatesPoint() {
        assertEquals(point1, point2);
    }

    @Test
    public void equalsPointThatEquatesToThisPoint() {
        assertEquals(point2, point1);
    }

    @Test
    public void equalsHashCodeWithSamePoint() {
        assertEquals(point1.hashCode(), point1.hashCode());
    }

    @Test
    public void equalsHashCodeWithSimilarAndEqualPoint() {
        assertEquals(point1.hashCode(), point2.hashCode());
    }
}