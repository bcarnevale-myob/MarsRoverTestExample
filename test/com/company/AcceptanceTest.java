package com.company;

import org.junit.Assert;
import org.junit.Test;

public class AcceptanceTest {

    @Test
    public void marsRoverLandsOnMars() {
        String expectedMars =   ". . . .\n" +
                                ". . . .\n" +
                                ". .R. .";

        Mars mars = Mars.fromString(". . . .\n" +
                                    ". . . .\n" +
                                    ". . . .");

        Coordinates landingCoordinates = new Coordinates(1,2);
        Rover rover = new Rover(landingCoordinates);
        mars.land(rover);
        String actualMars = mars.display();

        Assert.assertEquals(expectedMars, actualMars);
    }

}
