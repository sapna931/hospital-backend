package com.hospital.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.model.Appointment;
import com.hospital.repository.AppointmentRepository;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin("*")
public class AppointmentController {

    private final AppointmentRepository repo;

    public AppointmentController(AppointmentRepository repo) {
        this.repo = repo;
    }

    // GET ALL
    @GetMapping
    public List<Appointment> getAll() {
        return repo.findAll();
    }

    // SAVE
    @PostMapping
    public Appointment save(@RequestBody Appointment a) {
        return repo.save(a);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}