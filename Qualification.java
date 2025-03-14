package models;

public class Qualification {
    private String idQualification;
    private Float Note;
    private String EvaluationDate;

    public Qualification(){}

    public Qualification(String idQualification, Float note, String evaluationDate) {
        this.idQualification = idQualification;
        Note = note;
        EvaluationDate = evaluationDate;
    }

    public String getIdQualification() {
        return idQualification;
    }

    public void setIdQualification(String idQualification) {
        this.idQualification = idQualification;
    }

    public Float getNote() {
        return Note;
    }

    public void setNote(Float note) {
        Note = note;
    }

    public String getEvaluationDate() {
        return EvaluationDate;
    }

    public void setEvaluationDate(String evaluationDate) {
        EvaluationDate = evaluationDate;
    }
}
