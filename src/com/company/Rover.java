package com.company;

public class Rover {

    private Coordinates currentCoordinates;

    public Rover(Coordinates landingCoordinates) {

        this.currentCoordinates = new Coordinates(landingCoordinates);

    }

    public Coordinates getCurrentCoordinates() {
        return new Coordinates(this.currentCoordinates);
    }
}
