package com.example.ClassRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Course {

    private Integer idCourse;
    private String Name;

    @ManyToOne
    @JoinColumn(name = "fk_docente",referencedColumnName = "id_Teacher")
    @JsonBackReference
    Teacher teacher;

    public Course(){}

    public Course(Integer idCourse, String name) {
        this.idCourse = idCourse;
        Name = name;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
