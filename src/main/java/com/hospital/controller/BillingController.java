package com.hospital.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.hospital.model.Billing;
import com.hospital.repository.BillingRepository;

@RestController
@RequestMapping("/api/billing")
@CrossOrigin("*")
public class BillingController {

    private final BillingRepository repo;

    public BillingController(BillingRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Billing> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Billing save(@RequestBody Billing b) {
        return repo.save(b);
    }
}