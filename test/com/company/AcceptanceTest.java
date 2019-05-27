package com.company;

import org.junit.Assert;
import org.junit.Test;

public class AcceptanceTest {

    @Test
    public void marsRoverLandsOnMars() {
        String expectedMars =   ". . . .\n" +
                                ". .R. .\n" +
                                ". . . .";

        Mars mars = new Mars("   \n" +
                                   "   \n" +
                                   "   ");

        Coordinate landingCoordinate = new Coordinate(1,1);
        Rover rover = new Rover(landingCoordinate);
        mars.land(rover);
        String actualMars = mars.display();

        Assert.assertEquals(expectedMars, actualMars);
    }

}
