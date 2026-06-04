package com.hospital.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patient;
    private String doctor;
    private String appointmentId;
    private double totalAmount;

    @ElementCollection
    private List<String> items;

    // getters setters

    public Long getId() { return id; }

    public String getPatient() { return patient; }
    public void setPatient(String patient) { this.patient = patient; }

    public String getDoctor() { return doctor; }
    public void setDoctor(String doctor) { this.doctor = doctor; }

    public String getAppointmentId() { return appointmentId; }
    public void setAppointmentId(String appointmentId) { this.appointmentId = appointmentId; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public List<String> getItems() { return items; }
    public void setItems(List<String> items) { this.items = items; }
}