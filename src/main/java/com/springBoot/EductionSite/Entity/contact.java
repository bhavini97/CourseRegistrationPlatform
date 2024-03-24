package com.springBoot.EductionSite.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Faculty_name")
    private String name;

    @Column(name = "quali")
    private String qualification;

    @Column(name = "y_o_e")
    private int experience;

    public contact() {
    }

    public contact(int id, String name, String qualification, int experience) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
