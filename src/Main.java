import model.*;
import user.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //creare obiecte
        Catalog c = Catalog.getInstanta();
        Scanner citire = new Scanner(System.in);

        //creare useri si materii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //-----Instantiate 3 Universitate objects-----
        Universitate universitate1 = new Universitate.Builder()
                .withId(1)
                .withNume("UNIBUC").withTelefon("07328751293").withEmail("unibuc@example.com").build();
        Universitate universitate2 = new Universitate.Builder().withId(2).withNume("UMFCD").withTelefon("07238613204").withEmail("umfcd@example.com").build();
        Universitate universitate3 = new Universitate.Builder().withId(10).withNume("UNATC").withTelefon("07387409136").withEmail("unatc@example.com").build();

        //-----Instantiate 4 Facultate objects-----
        Facultate facultate1 = new Facultate.Builder().withId(1).withNume("FMI").withTelefon("0739471371").withEmail("fmi@example.com").withAdresa("Address f1").withUniversitate(universitate1).build();
        Facultate facultate2 = new Facultate.Builder().withId(2).withNume("FJS").withTelefon("0714780364").withEmail("fjs@example.com").withAdresa("Address f2").withUniversitate(universitate1).build();
        Facultate facultate3 = new Facultate.Builder().withId(3).withNume("Facultatea de Farmacie").withTelefon("073249879016").withEmail("ff@example.com").withAdresa("Address f3").withUniversitate(universitate2).build();
        Facultate facultate4 = new Facultate.Builder().withId(4).withNume("Facultatea de Teatru").withTelefon("07984265026").withEmail("ft@example.com").withAdresa("Address f4").withUniversitate(universitate3).build();

        //-----Instantiate 3 Anunt objects-----
        Anunt announcement1 = new Anunt.Builder().withId(1).withTitle("Important Announcement").withContent("This is an important announcement.").withDateTime(LocalDateTime.now()).withAuthorFacultate(facultate1).build();
        Anunt announcement2 = new Anunt.Builder().withId(2).withTitle("Reminder").withContent("Just a friendly reminder.").withDateTime(LocalDateTime.now()).withAuthorFacultate(facultate2).build();
        Anunt announcement3 = new Anunt.Builder().withId(3).withTitle("Meeting Cancelled").withContent("The meeting scheduled for today has been cancelled.").withDateTime(LocalDateTime.now()).withAuthorFacultate(facultate3).build();

        //-----Instantiate 5 Materie objects--------
        Materie materie1 = new Materie.Builder().withId(1).withDenumire("Mathematics").withCredite(5).withExamGrade(8.5).withProjectGrade(9.0).build();
        Materie materie2 = new Materie.Builder().withId(2).withDenumire("Physics").withCredite(4).withExamGrade(7.8).withProjectGrade(8.2).build();
        Materie materie3 = new Materie.Builder().withId(3).withDenumire("Computer Science").withCredite(6).withExamGrade(9.2).withProjectGrade(9.5).build();
        Materie materie4 = new Materie.Builder().withId(4).withDenumire("Biology").withCredite(3).withExamGrade(8.0).withProjectGrade(7.5).build();
        Materie materie5 = new Materie.Builder().withId(5).withDenumire("Chemistry").withCredite(4).withExamGrade(7.5).withProjectGrade(8.0).build();

        //-----Instantiate 6 Student objects-----
        Student student1 = new Student.Builder().withId(1).withNume("Ion").withPrenume("Popescu").withCnp("1234567890121").withEmail("ion.popescu@example.com").withTelefon("12345678901").withFacultate(facultate1).withRol(RolUser.STUDENT).withDataInscriere(new Date()).withGrupa(363).withMaterii(List.of(materie1,materie2,materie3)).build();
        Student student2 = new Student.Builder().withId(2).withNume("Maria").withPrenume("Ionescu").withCnp("1234567890122").withEmail("maria.ionescu@example.com").withTelefon("12345678902").withFacultate(facultate1).withRol(RolUser.STUDENT).withDataInscriere(new Date()).withGrupa(263).withMaterii(List.of(materie1,materie2)).build();
        Student student3 = new Student.Builder().withId(3).withNume("Andrei").withPrenume("Pop").withCnp("1234567890123").withEmail("andrei.pop@example.com").withTelefon("12345678903").withFacultate(facultate3).withRol(RolUser.STUDENT).withDataInscriere(new Date()).withGrupa(462).withMaterii(List.of(materie1,materie4,materie5)).build();
        Student student4 = new Student.Builder().withId(4).withNume("Elena").withPrenume("Dragomir").withCnp("1234567890124").withEmail("elena.dragomir@example.com").withTelefon("12345678904").withFacultate(facultate3).withRol(RolUser.STUDENT).withDataInscriere(new Date()).withGrupa(161).withMaterii(List.of(materie4,materie5)).build();
        Student student5 = new Student.Builder().withId(5).withNume("Alexandru").withPrenume("Munteanu").withCnp("1234567890125").withEmail("alexandru.munteanu@example.com").withTelefon("12345678905").withFacultate(facultate4).withRol(RolUser.STUDENT).withDataInscriere(new Date()).withGrupa(363).withMaterii(List.of(materie2)).build();
        Student student6 = new Student.Builder().withId(6).withNume("Ana").withPrenume("Stanciu").withCnp("1234567890126").withEmail("ana.stanciu@example.com").withTelefon("12345678906").withFacultate(facultate2).withRol(RolUser.STUDENT).withDataInscriere(new Date()).withGrupa(362).withMaterii(List.of(materie1,materie2)).build();

        //-----Adaug note pt fiecare student
        student1.addExamGrade(materie1, 9.5); student1.addProjectGrade(materie1, 8.0);
        student1.addExamGrade(materie2, 8.0); student1.addProjectGrade(materie2, 7.5);
        student1.addExamGrade(materie3, 7.0); student1.addProjectGrade(materie3, 6.5);

        student2.addExamGrade(materie1, 7.0); student2.addProjectGrade(materie1, 6.5);
        student2.addExamGrade(materie2, 8.5); student2.addProjectGrade(materie2, 9.0);

        student3.addExamGrade(materie1, 9.0); student3.addProjectGrade(materie1, 8.5);
        student3.addExamGrade(materie4, 7.5); student3.addProjectGrade(materie4, 8.0);
        student3.addExamGrade(materie5, 8.0); student3.addProjectGrade(materie5, 7.5);

        student4.addExamGrade(materie4, 8.0); student4.addProjectGrade(materie4, 7.5);
        student4.addExamGrade(materie5, 7.0); student4.addProjectGrade(materie5, 6.5);

        student5.addExamGrade(materie2, 8.0); student5.addProjectGrade(materie2, 7.5);

        student6.addExamGrade(materie1, 9.5); student6.addProjectGrade(materie1, 8.0);
        student6.addExamGrade(materie2, 8.0); student6.addProjectGrade(materie2, 7.5);

        //-----Instantiez 6 Profesor objects-----
        Profesor profesor1 = new Profesor.Builder().withId(1).withNume("Eminescu").withPrenume("Mihai").withCnp("1234567890123").withEmail("eminescu.mihai@example.com").withTelefon("1234567890").withFacultate(facultate1).withRol(RolUser.PROFESOR).withDataAngajare(new Date()).withMaterii(List.of(materie1, materie2)).build();
        Profesor profesor2 = new Profesor.Builder().withId(2).withNume("Arghezi").withPrenume("Tudor").withCnp("1234567890124").withEmail("arghezi.tudor@example.com").withTelefon("1234567891").withFacultate(facultate1).withRol(RolUser.PROFESOR).withDataAngajare(new Date()).withMaterii(List.of(materie3, materie4)).build();
        Profesor profesor3 = new Profesor.Builder().withId(3).withNume("Bacovia").withPrenume("George").withCnp("1234567890125").withEmail("bacovia.george@example.com").withTelefon("1234567892").withFacultate(facultate2).withRol(RolUser.PROFESOR).withDataAngajare(new Date()).withMaterii(List.of(materie5)).build();
        Profesor profesor4 = new Profesor.Builder().withId(4).withNume("Cosbuc").withPrenume("George").withCnp("1234567890126").withEmail("cosbuc.george@example.com").withTelefon("1234567893").withFacultate(facultate4).withRol(RolUser.PROFESOR).withDataAngajare(new Date()).withMaterii(List.of(materie3)).build();
        Profesor profesor5 = new Profesor.Builder().withId(5).withNume("Eminescu").withPrenume("Veronica").withCnp("1234567890127").withEmail("veronica.eminescu@example.com").withTelefon("1234567894").withFacultate(facultate3).withRol(RolUser.PROFESOR).withDataAngajare(new Date()).withMaterii(List.of(materie2)).build();
        Profesor profesor6 = new Profesor.Builder().withId(6).withNume("Alecsandri").withPrenume("Vasile").withCnp("1234567890128").withEmail("alecsandri.vasile@example.com").withTelefon("1234567895").withFacultate(facultate2).withRol(RolUser.PROFESOR).withDataAngajare(new Date()).withMaterii(List.of(materie1)).build();


        //-----adaug datele in catalog-----
        c.adaugaStudent(student1);
        c.adaugaStudent(student2);
        c.adaugaStudent(student3);
        c.adaugaStudent(student4);
        c.adaugaStudent(student5);
        c.adaugaStudent(student6);

        System.out.println("-----------MENIU-----------");
        int tasta = 1;
        while(tasta != 0){
            System.out.println("\n1. Afisare studenti"); //
            System.out.println("\n2. Afisare studenti dintr-o universitate"); //
            System.out.println("\n3. Afisare studenti alfabetic"); //
            System.out.println("\n4. Cautare student"); //
            System.out.println("\n5. Adaugare student"); //
            System.out.println("\n6. Sterge student"); //
            System.out.println("\n7. "); //Afisare anunturi
            System.out.println("\n8. "); //Adaugare profesor?
            System.out.println("\n9. "); //Cautare profesor?
            System.out.println("\n10. "); //Sterge profesor?
            System.out.println("\n0. EXIT");

            tasta = citire.nextInt();
            citire.nextLine();

            switch(tasta){
                case 1:
                    c.afisareStudenti();
                    break;
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nAti introdus tasta gresita!");
            }
        }
    }
}