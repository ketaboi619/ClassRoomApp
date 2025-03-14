package models;

public class Registration {

    private Integer idRegistration;
    private String RegistrationDate;

    public Registration(){}

    public Registration(int idRegistration, String registrationDate) {
        this.idRegistration = idRegistration;
        RegistrationDate = registrationDate;
    }

    public Integer getIdRegistration() {
        return idRegistration;
    }

    public void setIdRegistration(Integer idRegistration) {
        this.idRegistration = idRegistration;
    }

    public String getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        RegistrationDate = registrationDate;
    }
}
