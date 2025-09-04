package com.example.EventManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.EventManagementSystem.entity.Attendee;
import com.example.EventManagementSystem.repository.AttendeeRepository;

@RestController
@RequestMapping("/attendees")
public class AttendeeController {

    @Autowired
    private AttendeeRepository attendeeRepo;

    @GetMapping
    public List<Attendee> getAllAttendees() { return attendeeRepo.findAll(); }

    @PostMapping
    public Attendee createAttendee(@RequestBody Attendee attendee) { return attendeeRepo.save(attendee); }
}
