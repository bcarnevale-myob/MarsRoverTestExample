package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {

    @Test
    public void canGetCurrentCoordinates() {
        Coordinates landingCoordinates = new Coordinates(1, 1);
        Coordinates expectedCoordinates = new Coordinates(1, 1);

        Rover rover = new Rover(landingCoordinates);

        assertEquals(expectedCoordinates, rover.getCurrentCoordinates());
    }

}