package org.generation.classes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents;

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }//Constructor

    public void enroll(Student student) {
        if(student.year == year) {
    	enrolledStudents.add(student);
        System.out.println(student.firstName + " " + student.lastName + " se inscribió a " + courseName);
        } else {
        	System.out.println(student.firstName + " " + student.lastName + " no puede inscribirse a " + courseName);
        }
    }//enroll
    
    public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student); 
        }
    }//enroll

    public void unEnroll(Student student) {
        if (enrolledStudents.remove(student)) {
            System.out.println(student.firstName + " " + student.lastName + " se desinscribió de " + courseName);
        } else {
            System.out.println(student.firstName + " " + student.lastName + " no está inscrito en " + courseName);
        }
    }//unEnroll

    public int countStudents() {
        return enrolledStudents.size();
    }//countStudents

    public int bestGrade() {
        int bestGrade = 0;
        for (Student student : enrolledStudents) {
            if (student.grade > bestGrade) {
                bestGrade = student.grade;
            }
        }
        return bestGrade;
    }//bestGrade
    
    //Challenge
    public double averageGrade() {
        if (enrolledStudents.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (Student student : enrolledStudents) {
            total += student.grade;
        }
        return total/enrolledStudents.size();
    }//averageGrade

    public void printRanking() {
        // Copia de la lista para ordenarla
        List<Student> sortedStudents = new ArrayList<>(enrolledStudents);
        sortedStudents.sort(Comparator.comparingInt(s -> -s.grade)); // Ordenado de forma descendente

        System.out.println("Ranking de estudiantes en " + courseName + ":");
        for (int i = 0; i < sortedStudents.size(); i++) {
            Student student = sortedStudents.get(i);
            System.out.println((i + 1) + ". " + student.firstName + " " + student.lastName + " - Calificación: " + student.grade);
        }
    }//printRanking

    public void checkAboveAverage() {
        double average = averageGrade();
        for (Student student : enrolledStudents) {
            if (student.grade > average) {
                System.out.println(student.firstName + " " + student.lastName + " está sobre el promedio.");
            } else {
                System.out.println(student.firstName + " " + student.lastName + " está debajo del promedio.");
            }
        }
    }//checkAboveAverage
}//class Course
