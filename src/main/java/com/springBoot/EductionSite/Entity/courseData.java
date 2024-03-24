package com.springBoot.EductionSite.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "details")
public class courseData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="course_name")
    private String courseName;

    @Column(name="reg_date")
    private String regDate;

    @Column(name="course_duration")
    private int duration;

    public courseData(){

    }
    public courseData(int id, String courseName, String regDate, int duration) {
        this.id = id;
        this.courseName = courseName;
        this.regDate = regDate;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
