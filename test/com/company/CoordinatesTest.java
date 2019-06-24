package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesTest {

    @Test
    public void coordinatesAreEqualWhenXAndYAreTheSame() {
        Coordinates coordinates1 = new Coordinates(1,1);
        Coordinates coordinates2 = new Coordinates(1,1);

        assertEquals(coordinates1, coordinates2);
    }

    @Test
    public void coordinatesAreNotEqualWhenXsAreDifferent() {
        Coordinates coordinates1 = new Coordinates(0,1);
        Coordinates coordinates2 = new Coordinates(2,1);

        assertNotEquals(coordinates1, coordinates2);
    }

    @Test
    public void coordinatesAreNotEqualWhenYsAreDifferent() {
        Coordinates coordinates1 = new Coordinates(0,1);
        Coordinates coordinates2 = new Coordinates(0,2);

        assertNotEquals(coordinates1, coordinates2);
    }
}