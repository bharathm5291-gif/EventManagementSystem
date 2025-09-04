package com.example.EventManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.EventManagementSystem.entity.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {}
