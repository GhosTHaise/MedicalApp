package mg.ghostcorp.model;

public class Patients {
    int id_patients;
    int age;
    String nom;

    public Patients(int id_patients, int age, String nom) {
        this.id_patients = id_patients;
        this.age = age;
        this.nom = nom;
    }

    public int getId_patients() {
        return id_patients;
    }

    public void setId_patients(int id_patients) {
        this.id_patients = id_patients;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
