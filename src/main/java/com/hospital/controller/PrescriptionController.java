package com.hospital.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.model.Prescription;
import com.hospital.repository.PrescriptionRepository;

@RestController
@RequestMapping("/api/prescriptions")
@CrossOrigin("*")
public class PrescriptionController {

    private final PrescriptionRepository repo;

    public PrescriptionController(PrescriptionRepository repo) {
        this.repo = repo;
    }

    // GET ALL
    @GetMapping
    public List<Prescription> getAll() {
        return repo.findAll();
    }

    // SAVE
    @PostMapping
    public Prescription save(@RequestBody Prescription p) {
        return repo.save(p);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}