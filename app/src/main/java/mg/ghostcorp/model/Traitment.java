package mg.ghostcorp.model;

public class Traitment {
    String Date_debut;
    int id_traitment;
    int id_patients;

    public Traitment(String date_debut, int id_traitment, int id_patients) {
        Date_debut = date_debut;
        this.id_traitment = id_traitment;
        this.id_patients = id_patients;
    }

    public String getDate_debut() {
        return Date_debut;
    }

    public void setDate_debut(String date_debut) {
        Date_debut = date_debut;
    }

    public int getId_traitment() {
        return id_traitment;
    }

    public void setId_traitment(int id_traitment) {
        this.id_traitment = id_traitment;
    }

    public int getId_patients() {
        return id_patients;
    }

    public void setId_patients(int id_patients) {
        this.id_patients = id_patients;
    }
}

