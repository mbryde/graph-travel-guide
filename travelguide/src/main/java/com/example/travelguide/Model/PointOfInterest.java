package com.example.travelguide.Model;

import org.springframework.stereotype.Component;

@Component
public class PointOfInterest {
    String name;
    Float latitude;
    Float longitude;

    public PointOfInterest(String name, Float latitude, Float longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String toJson() {
        return String.format("{'name': %s, 'latitude': %f, 'longitude': %f}", name, latitude, longitude);
    }
}
