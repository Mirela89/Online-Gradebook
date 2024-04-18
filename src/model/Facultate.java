package model;

import user.Profesor;
import user.Student;

import java.util.ArrayList;
import java.util.List;

public class Facultate {
    private long id;
    private String nume;
    private String telefon;
    private String email;
    private String adresa;

    private Universitate universitate;

    // Constructor
    private Facultate() {
    }

    //getteri si setteri
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Universitate getUniversitate() {
        return universitate;
    }

    public void setUniversitate(Universitate universitate) {
        this.universitate = universitate;
    }


    // Builder class
    public static class Builder {
        private Facultate facultate;

        public Builder() {
            facultate = new Facultate();
        }

        public Builder withId(long id) {
            facultate.setId(id);
            return this;
        }

        public Builder withNume(String nume) {
            facultate.setNume(nume);
            return this;
        }

        public Builder withTelefon(String telefon) {
            facultate.setTelefon(telefon);
            return this;
        }

        public Builder withEmail(String email) {
            facultate.setEmail(email);
            return this;
        }

        public Builder withAdresa(String adresa) {
            facultate.setAdresa(adresa);
            return this;
        }

        public Builder withUniversitate(Universitate universitate) {
            facultate.setUniversitate(universitate);
            return this;
        }

        public Facultate build() {
            return facultate;
        }
    }
}
