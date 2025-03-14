package com.example.ClassRoomAPI.models;

import jakarta.persistence.ManyToOne;

public class Course {

    private Integer idCourse;
    private String Name;

    @ManyToOne
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

    }
}
