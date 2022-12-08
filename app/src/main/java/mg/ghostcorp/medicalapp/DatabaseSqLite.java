package mg.ghostcorp.medicalapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseSqLite extends SQLiteOpenHelper {

    public DatabaseSqLite(@Nullable Context context) {
        //information sur la base de donnee
        super(context, "AndroidSuiviMedical", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE Patients(id_patients INTEGER  NOT NULL ," +
                    "nom Varchar (50) NOT NULL ,prenom Varchar (50) NOT NULL ," +
                    "age Int NOT NULL ,Email Varchar (20) NOT NULL ," +
                    "CONSTRAINT Patients_PK PRIMARY KEY (id_patients))");

            db.execSQL("CREATE TABLE Traitements(" +
                    "id_traitement Int  NOT NULL , " +
                    "Date_debut Varchar (20) NOT NULL , " +
                    "id_patients Int NOT NULL ," +
                    "CONSTRAINT Traitement_PK PRIMARY KEY (id_traitement)" +
                    " ,CONSTRAINT Traitement_Patients_FK FOREIGN KEY (id_patients) REFERENCES Patients(id_patients)" +
                    ")");

            db.execSQL("CREATE TABLE Medicaments(" +
                    "id_medicamants Int NOT NULL ," +
                    "Nom Varchar (20) NOT NULL ," +
                    "nombre_comprimes Int NOT NULL ," +
                    "CONSTRAINT Medicaments_PK PRIMARY KEY (id_medicamants))");

            db.execSQL("CREATE TABLE contenir(" +
                    "id_medicamants Int NOT NULL ," +
                    "id_traitement  Int NOT NULL," +
                    "CONSTRAINT contenir_PK PRIMARY KEY (id_medicamants,id_traitement)," +
                    "CONSTRAINT contenir_Medicaments_FK FOREIGN KEY (id_medicamants) REFERENCES Medicaments(id_medicamants),CONSTRAINT contenir_Traitements0_FK FOREIGN KEY (id_traitement) REFERENCES Traitements(id_traitement))");

            db.execSQL("CREATE TABLE Prendre(id_medicamants Int NOT NULL ," +
                    "id_patients Int NOT NULL ," +
                    "nombre Int NOT NULL," +
                    "CONSTRAINT Prendre_PK PRIMARY KEY (id_medicamants,id_patients)," +
                    "CONSTRAINT Prendre_Medicaments_FK FOREIGN KEY (id_medicamants) REFERENCES Medicaments(id_medicamants)," +
                    "CONSTRAINT Prendre_Patients0_FK FOREIGN KEY (id_patients) REFERENCES Patients(id_patients))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS Patients");
            db.execSQL("DROP TABLE if EXISTS Traitements");
            db.execSQL("DROP TABLE if EXISTS Medicaments");
            db.execSQL("DROP TABLE IF EXISTS contenir");
            db.execSQL("DROP TABLE IF EXISTS Prendre");

            onCreate(db);
    }
}
