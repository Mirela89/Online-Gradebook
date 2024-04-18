package model;
import java.util.*;
import user.Student;

public class Catalog {
    private final Scanner scanner = new Scanner(System.in);
    private List<Student> studenti;

    private static Catalog instanta = null;

    //constructor
    private Catalog() {
        this.studenti = new ArrayList<>();
    }

    public synchronized static Catalog getInstanta() {
        if (instanta == null) {
            instanta = new Catalog();
        }
        return instanta;
    }


    //alte functii?
    // Function to add a single student
    public void adaugaStudent(Student student) {
        studenti.add(student);
    }

    //1. Afisare studenti dintr-o grupa
    // Function to display all students
    public void afisareStudenti() {
        if (studenti.isEmpty()) {
            System.out.println("Nu exista studenti inregistrati.");
        } else {
            System.out.println("Studenti inregistrati:");
            for (Student student : studenti) {
                System.out.println(student);
            }
        }
    }
}
