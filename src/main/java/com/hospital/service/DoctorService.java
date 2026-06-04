package com.hospital.service;

import com.hospital.model.Doctor;
import com.hospital.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository repo;

    public DoctorService(DoctorRepository repo) {
        this.repo = repo;
    }

    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }

    public Doctor addDoctor(Doctor d) {
        return repo.save(d);
    }

    public Doctor getDoctorById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteDoctor(Long id) {
        repo.deleteById(id);
    }
}