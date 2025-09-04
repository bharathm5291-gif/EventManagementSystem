package com.example.EventManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EventManagementSystem.entity.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
