package com.hospital.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Medicine {

    private String name;
    private String dosage;
    private String duration;
    private String instruction;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDosage() { return dosage; }
    public void setDosage(String dosage) { this.dosage = dosage; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getInstruction() { return instruction; }
    public void setInstruction(String instruction) { this.instruction = instruction; }
}