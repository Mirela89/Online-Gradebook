package model;

import user.Student;
import java.util.HashMap;
import java.util.Map;

public class Materie {
    private long id;
    private String denumire;
    private int credite;
    private double examGrade;
    private double projectGrade;
    private double finalGrade;

    // Map to store exam grades for each student
    private Map<Student, Double> examGrades = new HashMap<>();
    // Map to store project grades for each student
    private Map<Student, Double> projectGrades = new HashMap<>();

    //constructor
    private Materie() {
    }

    //getteri & setteri
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public double getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(double examGrade) {
        this.examGrade = examGrade;
        calculateFinalGrade();
    }

    public double getProjectGrade() {
        return projectGrade;
    }

    public void setProjectGrade(double projectGrade) {
        this.projectGrade = projectGrade;
        calculateFinalGrade();
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    // Calculate final grade based on examGrade and projectGrade
    private void calculateFinalGrade() {
        finalGrade = 0.6 * examGrade + 0.4 * projectGrade;
    }

    // Builder class
    public static class Builder{
        private Materie materie;

        public Builder() {
            materie = new Materie();
        }

        public Builder withId(long id) {
            materie.setId(id);
            return this;
        }

        public Builder withDenumire(String denumire) {
            materie.setDenumire(denumire);
            return this;
        }

        public Builder withCredite(int credite) {
            materie.setCredite(credite);
            return this;
        }

        public Builder withExamGrade(double examGrade) {
            materie.setExamGrade(examGrade);
            return this;
        }

        public Builder withProjectGrade(double projectGrade) {
            materie.setProjectGrade(projectGrade);
            return this;
        }

        public Materie build() {
            return materie;
        }
    }

    // Method to add exam grade for a student
    public void addExamGrade(Student student, double grade) {
        examGrades.put(student, grade);
    }

    // Method to add project grade for a student
    public void addProjectGrade(Student student, double grade) {
        projectGrades.put(student, grade);
    }
}
