package org.generation.classes;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
 // Constructor con todos los atributos
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }//constructor

    // Constructor con nombre y apellido
    public Student(String firstName, String lastName) {
        this(firstName, lastName, 000000, 0, 1); // Default
    }//constructor

    // Constructor con nombre, apellido y registration(matrícula)
    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 1); // Default
    }//constructor
    
    public void printFullName(){
    	System.out.println(firstName + " " + lastName);
     }//printFullName

     boolean isApproved(){
         return grade >=60;
     }//isApproved

     public int changeYearIfApproved(){
    	 if (isApproved()) {
             year++;
             System.out.println("¡Felicidades, " + firstName + " " + lastName + "! Aprobaste y ahora estás en " + year + " año");
         } else {
        	 System.out.println("Lo siento, " + firstName + " " + lastName + ", Reprobaste y te quedas en " + year + " año :'(");
         }
         return year;
     }//changeYearIfApproved
    
}// Student
