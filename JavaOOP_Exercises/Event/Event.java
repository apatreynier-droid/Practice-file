package Event;

import java.util.*;


class Event {
    private String eventName;
    private String date;     
    private String location;

    public Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    
    public String getEventName() { return eventName; }
    public String getDate() { return date; }
    public String getLocation() { return location; }

    
    public void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    public boolean isConflict(Event other) {
        return this.date.equals(other.date) && this.location.equalsIgnoreCase(other.location);
    }
}

class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String eventName, String date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        System.out.println("📘 Seminar Details:");
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
        System.out.println();
    }
}

class MusicalPerformance extends Event {
    private List<String> performerList;

    public MusicalPerformance(String eventName, String date, String location, List<String> performerList) {
        super(eventName, date, location);
        this.performerList = performerList;
    }

    @Override
    public void displayDetails() {
        System.out.println("🎵 Musical Performance Details:");
        super.displayDetails();
        System.out.println("Performers: " + String.join(", ", performerList));
        System.out.println();
    }
}



