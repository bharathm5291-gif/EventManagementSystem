package com.example.EventManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.EventManagementSystem.entity.Event;
import com.example.EventManagementSystem.repository.EventRepository;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository eventRepo;

    // Get all events
    @GetMapping
    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }

    // Add a new event
    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventRepo.save(event);
    }
}
