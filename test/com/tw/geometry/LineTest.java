package com.tw.geometry;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void shouldHaveLengthZeroForLineWithSameCoordinates() {
        assertEquals(0,new Line(0.0,0.0,0.0,0.0).length(),0.0);
    }


}