package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.model.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}