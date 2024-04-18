package user;

import model.Facultate;
import model.Materie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Student extends AbstractUser {
    private Date data_inscriere; //data in care si-a inceput studiile
    private int grupa; //grupa in care se afla (ex:363)
    private List<Materie> materii = new ArrayList<Materie>(); //lista materii studiate

    // Map to store exam grades for each class
    private Map<Materie, Double> examGrades = new HashMap<>();
    // Map to store project grades for each class
    private Map<Materie, Double> projectGrades = new HashMap<>();

    private Student() {
        super(0, "", "", "", "", "", null, null);
    }

    //getteri si setteri
    public Date getData_inscriere() {
        return data_inscriere;
    }

    public void setData_inscriere(Date data_inscriere) {
        this.data_inscriere = data_inscriere;
    }

    public int getgrupa() {
        return grupa;
    }

    public void setgrupa(int grupa) {
        this.grupa = grupa;
    }

    public List<Materie> getMaterii() {
        return materii;
    }

    public void setMaterii(List<Materie> materii) {
        this.materii = materii;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", nume='" + getNume() + '\'' +
                ", prenume='" + getPrenume() + '\'' +
                ", cnp='" + getCnp() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefon='" + getTelefon() + '\'' +
                ", facultate='" + getFacultate() + '\'' +
                ", data inscriere='" + getData_inscriere() + '\'' +
                ", grupa='" + getgrupa() + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private Student student;

        public Builder() {
            student = new Student();
        }

        public Builder withId(long id) {
            student.setId(id);
            return this;
        }

        public Builder withNume(String nume) {
            student.setNume(nume);
            return this;
        }

        public Builder withPrenume(String prenume) {
            student.setPrenume(prenume);
            return this;
        }

        public Builder withCnp(String cnp) {
            student.setCnp(cnp);
            return this;
        }

        public Builder withEmail(String email) {
            student.setEmail(email);
            return this;
        }

        public Builder withTelefon(String telefon) {
            student.setTelefon(telefon);
            return this;
        }

        public Builder withFacultate(Facultate facultate) {
            student.setFacultate(facultate);
            return this;
        }

        public Builder withRol(RolUser rol) {
            student.setRol(rol);
            return this;
        }

        public Builder withDataInscriere(Date data_inscriere) {
            student.setData_inscriere(data_inscriere);
            return this;
        }

        public Builder withGrupa(int grupa) {
            student.setgrupa(grupa);
            return this;
        }

        public Builder withMaterii(List<Materie> materii) {
            student.setMaterii(materii);
            return this;
        }

        public Student build() {
            return student;
        }
    }

    // Method to add exam grade for a class
    public void addExamGrade(Materie materie, double grade) {
        examGrades.put(materie, grade);
    }

    // Method to add project grade for a class
    public void addProjectGrade(Materie materie, double grade) {
        projectGrades.put(materie, grade);
    }
}