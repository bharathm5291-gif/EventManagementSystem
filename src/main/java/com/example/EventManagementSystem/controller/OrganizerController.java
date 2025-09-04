package com.example.EventManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.EventManagementSystem.entity.Organizer;
import com.example.EventManagementSystem.repository.OrganizerRepository;

@RestController
@RequestMapping("/organizers")
public class OrganizerController {

    @Autowired
    private OrganizerRepository organizerRepo;

    @GetMapping
    public List<Organizer> getAllOrganizers() { return organizerRepo.findAll(); }

    @PostMapping
    public Organizer createOrganizer(@RequestBody Organizer organizer) { return organizerRepo.save(organizer); }
}
