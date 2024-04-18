package model;

import java.util.ArrayList;
import java.util.List;

public class Universitate {
    private long id;
    private String nume;
    private String telefon;
    private String email;

    //constructor
    private Universitate() {
    }

    //getteri & setteri
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

    // Builder class

    public static class Builder {
        private Universitate universitate;

        public Builder() {
            universitate = new Universitate();
        }

        public Builder withId(long id) {
            universitate.setId(id);
            return this;
        }

        public Builder withNume(String nume) {
            universitate.setNume(nume);
            return this;
        }

        public Builder withTelefon(String telefon) {
            universitate.setTelefon(telefon);
            return this;
        }

        public Builder withEmail(String email) {
            universitate.setEmail(email);
            return this;
        }

        public Universitate build() {
            return universitate;
        }
    }
}
