package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}