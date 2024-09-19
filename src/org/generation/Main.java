package org.generation;

import org.generation.classes.Course;
import org.generation.classes.Student;

public class Main {

	public static void main(String[] args) {
		// Crear estudiantes
        Student student1 = new Student("Laura", "Martínez", 1018, 75, 1);
        Student student2 = new Student("Fernando", "Sánchez", 1026, 50, 2);
        Student student3 = new Student("Ana", "Torres", 1033);
        Student student4 = new Student("Luis", "Fernández", 1046, 92, 2);
        Student student5 = new Student("Isabel", "Ramírez");

        // Full names
        student1.printFullName();
        student2.printFullName();
        student3.printFullName();
        student4.printFullName();
        student5.printFullName();
        
        System.out.println();

        // Crear cursos
        Course math1 = new Course("Matemáticas 1", "Juan Pérez", 1);
        Course math2 = new Course("Matemáticas 2", "María González", 2);
        Course english1 = new Course("Inglés 1", "Carlos López", 1);

        // Inscribir estudiantes a mate 1
        math1.enroll(student1);
        math1.enroll(student2);
        math1.enroll(student3);
        
        Student[] newMath1Students = {student4, student5};
        math1.enroll(newMath1Students);
        
        System.out.println();
        
        // Desinscribir un estudiante
        math1.unEnroll(student3);
        math1.unEnroll(student2);
        
        System.out.println();

        // Contar estudiantes en un curso
        System.out.println("Número de alumnos inscritos: " + math1.countStudents());
        
        System.out.println();

        // Obtener la mejor calificación
        System.out.println("Mejor calificación: " + math1.bestGrade());
        
        System.out.println();
        
        // Calcular el promedio
        double averageGrade = math1.averageGrade();
        System.out.println("Promedio del curso: " + averageGrade);
        
        System.out.println();

        // Imprimir el ranking
        math1.printRanking();
        
        System.out.println();

        // Estudiantes sobre el promedio
        math1.checkAboveAverage();
        
        System.out.println();
        
        // Promover de año si está aprobado
        student1.changeYearIfApproved();
        student2.changeYearIfApproved();
        
        System.out.println("=======================================");
        
        // Inscribir estudiantes a mate 2
        Student[] newMath2Students = {student1, student4};
        math2.enroll(newMath2Students);
        
        System.out.println("=======================================");
        
        // Inscribir estudiantes a inglés 1
        Student[] newEnglish1Students = {student1, student2, student3, student5};
        english1.enroll(newEnglish1Students);
    }//main

}//class Main
