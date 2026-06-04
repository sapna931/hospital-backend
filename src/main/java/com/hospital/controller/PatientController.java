package com.hospital.controller;

import com.hospital.model.Patient;
import com.hospital.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/patients")
public class PatientController {

    private final PatientRepository repo;

    public PatientController(PatientRepository repo) {
        this.repo = repo;
    }

    // GET all patients
    @GetMapping
    public List<Patient> getAll() {
        return repo.findAll();
    }

    // ADD patient
    @PostMapping
    public Patient add(@RequestBody Patient p) {
        return repo.save(p);
    }

    // DELETE patient
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}