package com.hospital.model;

import jakarta.persistence.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String gender;

    private String bloodGroup;   // ✅ IMPORTANT
    private double weight;       // ✅ IMPORTANT

    private String disease;

    // ✅ DOCTOR CONNECTION ADD
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    // GETTERS + SETTERS

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }

    // ✅ DOCTOR GETTER SETTER
    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }
}