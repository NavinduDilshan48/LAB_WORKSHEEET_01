package LW_05.Q2;

import java.util.ArrayList;

public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, Lecturer lecturer, Degree degree) {
        this.name = name;
        this.enrollType = enrollType;
        this.lecturerInCharge = lecturer;
        this.degreeBelongsTo = degree;
        this.numberOfStudentsEnrolled = 0;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Enroll Type: " + enrollType);
        System.out.println("Number of Students Enrolled: " + numberOfStudentsEnrolled);
        if(lecturerInCharge != null)
            System.out.println("Lecturer In Charge: " + lecturerInCharge.getName());
        if(degreeBelongsTo != null)
            System.out.println("Degree Belongs To: " + degreeBelongsTo.getName());
        System.out.println();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEnrollType() { return enrollType; }
    public void setEnrollType(String enrollType) { this.enrollType = enrollType; }
    public int getNumberOfStudentsEnrolled() { return numberOfStudentsEnrolled; }
    public void setNumberOfStudentsEnrolled(int number) { this.numberOfStudentsEnrolled = number; }

    public void addLecturerInCharge(Lecturer lecturer) { this.lecturerInCharge = lecturer; }
    public void removeLecturerInCharge() { this.lecturerInCharge = null; }
    public void addDegreeBelongsTo(Degree degree) { this.degreeBelongsTo = degree; }
    public void removeDegreeBelongsTo() { this.degreeBelongsTo = null; }
}

