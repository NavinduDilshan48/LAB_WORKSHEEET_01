package LW_05.Q2;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        listCoursesOffering();
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void listCoursesOffering() {
        System.out.println("Courses Offering:");
        if(coursesOffering.isEmpty()) {
            System.out.println("None");
        } else {
            for(Course c : coursesOffering) {
                System.out.println("- " + c.getName());
            }
        }
    }
}

