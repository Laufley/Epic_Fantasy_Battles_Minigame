package Rooms;

import Players.Physical.Knight;

public abstract class Room {
    private String location;
    private String description;

    // constructor
    public Room(String location) {
        this.location = location;
        this.description = "Unknown";
    }
    // overloaded constructor which includes a description.
    public Room(String location, String description) {
        this.location = location;
        this.description = description;
    }

    // Setters & Getters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
