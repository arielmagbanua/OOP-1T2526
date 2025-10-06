package models.persons;

import interfaces.Animal;

public class Student extends Person implements Animal {
     private String program;

     public void enrollProgram(String program) {
         this.program = program;
     }

     public void computeGrade() {
         String name = this.getFullName();
         this.setFullName("test");
         System.out.println("Computing grade...");
     }

    @Override
    public void makeSound() {
        System.out.println("Hoyyy!!!");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}
