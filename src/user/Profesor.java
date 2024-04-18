package user;

import model.Facultate;
import model.Materie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Profesor extends AbstractUser {
    private Date data_angajare;
    private List<Materie> materii = new ArrayList<>();

    // Private constructor
    private Profesor() {
        super(0, "", "", "", "", "", null, null);
    }

    // Getter and setter methods
    public Date getData_angajare() {
        return data_angajare;
    }

    public void setData_angajare(Date data_angajare) {
        this.data_angajare = data_angajare;
    }

    public List<Materie> getMaterii() {
        return materii;
    }

    public void setMaterii(List<Materie> materii) {
        this.materii = materii;
    }

    // Builder class
    public static class Builder {
        private Profesor profesor;

        public Builder() {
            profesor = new Profesor();
        }

        public Builder withId(long id) {
            profesor.setId(id);
            return this;
        }

        public Builder withNume(String nume) {
            profesor.setNume(nume);
            return this;
        }

        public Builder withPrenume(String prenume) {
            profesor.setPrenume(prenume);
            return this;
        }

        public Builder withCnp(String cnp) {
            profesor.setCnp(cnp);
            return this;
        }

        public Builder withEmail(String email) {
            profesor.setEmail(email);
            return this;
        }

        public Builder withTelefon(String telefon) {
            profesor.setTelefon(telefon);
            return this;
        }

        public Builder withFacultate(Facultate facultate) {
            profesor.setFacultate(facultate);
            return this;
        }

        public Builder withRol(RolUser rol) {
            profesor.setRol(rol);
            return this;
        }

        public Builder withDataAngajare(Date data_angajare) {
            profesor.setData_angajare(data_angajare);
            return this;
        }

        public Builder withMaterii(List<Materie> materii) {
            profesor.setMaterii(materii);
            return this;
        }

        public Profesor build() {
            return profesor;
        }
    }
}
