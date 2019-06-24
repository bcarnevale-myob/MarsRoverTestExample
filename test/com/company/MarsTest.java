package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarsTest {

    @Test
    public void canCreateMarsFromAString() {
        Mars mars = Mars.fromString(". . . .\n" +
                ". . . .\n" +
                ". . . .");
        String mapOfMars = ". . . .\n" +
                ". . . .\n" +
                ". . . .";

        assertEquals(mapOfMars, mars.display());
    }

}