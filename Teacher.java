package models;

import jakarta.persistence.Entity;

@Entity
public class Teacher {

    private int idTeacher;
    private String Specialism;

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
