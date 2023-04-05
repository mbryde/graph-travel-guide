package com.example.travelguide.Controller;

import com.example.travelguide.Model.PointOfInterest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
@RequestMapping("/map")
public class MapController {

    public record MapRouting(String from, String to){

    }

    @RequestMapping("/route")
    public void calculateRoute(@RequestBody MapRouting mapRouting) {

    }

    @RequestMapping("/sights")
    public ArrayList<PointOfInterest> sights() {
        return new ArrayList<>().add(new PointOfInterest("Test", 55.3, 12.3));
    }



}
