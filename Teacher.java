package com.example.ClassRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "teacher")
public class Teacher {

    private int idTeacher;
    private String Specialism;

    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    private List<Course> courses;

    public Teacher() {}

    public Teacher(int idTeacher, String specialism) {
        this.idTeacher = idTeacher;
        Specialism = specialism;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSpecialism() {
        return Specialism;
    }

    public void setSpecialism(String specialism) {
        Specialism = specialism;
    }
}
