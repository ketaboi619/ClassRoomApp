package models;


import jakarta.persistence.Entity;

@Entity
public class Student {

    private int idStudent;
    private int Grade;
    private String Birthdate;
    private String Adress;

    public Student(){
    }

    public Student(int idStudent, String adress, String birthdate, int grade) {
        this.idStudent = idStudent;
        this.Adress = adress;
        this.Birthdate = birthdate;
        this.Grade = grade;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

}
