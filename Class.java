package models;

public class Class {

    private String idClass;
    private String Name;

    public Class(){}

    public Class(String idClass, String name) {
        this.idClass = idClass;
        Name = name;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
