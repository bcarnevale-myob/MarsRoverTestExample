package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mars {
    public static final String MAP_SEPARATOR = ".";
    private List<List<String>> map;

    public static Mars fromString(String map) {
        Mars mars = new Mars();
        mars.map =  getMap(map);
        return mars;
    }

    private static List<List<String>> getMap(String map) {
        String mapNoDots = map.replace(MAP_SEPARATOR,"");
        List<List<String>> finalMap = new ArrayList<>();

        for (String row: mapNoDots.split("\n")) {
            finalMap.add(Arrays.asList(row.split("")));
        }

        return finalMap;
    }

    public void land(Rover rover) {
        Coordinates coordinates = rover.getCurrentCoordinates();
        map.get(coordinates.getY()).set(coordinates.getX(), "R");
    }

    public String display() {
        String finalMap = "";
        for (List<String> row: this.map) {
            finalMap += MAP_SEPARATOR + String.join(MAP_SEPARATOR, row) + MAP_SEPARATOR + "\n";
        }

        return finalMap.trim();
    }
}
