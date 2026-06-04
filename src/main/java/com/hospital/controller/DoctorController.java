package com.hospital.controller;

import com.hospital.model.Doctor;
import com.hospital.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService service;

    public DoctorController(DoctorService service) {
        this.service = service;
    }

    // ✅ GET ALL
    @GetMapping
    public List<Doctor> getAll() {
        return service.getAllDoctors();
    }

    // ✅ ADD
    @PostMapping
    public Doctor add(@RequestBody Doctor d) {
        return service.addDoctor(d);
    }

    // ✅ GET BY ID
    @GetMapping("/{id}")
    public Doctor getOne(@PathVariable Long id) {
        return service.getDoctorById(id);
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteDoctor(id);
    }
}