package LW_05.Q2;

import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        coursesOffering = new ArrayList<>();
        lecturersBelongsTo = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Department Name: " + name);
        if(departmentHead != null)
            System.out.println("Department Head: " + departmentHead.getName());
        else
            System.out.println("No department head appointed.");
        System.out.println("Lecturers:");
        if(lecturersBelongsTo.isEmpty()) System.out.println("None");
        else for(Lecturer l : lecturersBelongsTo) System.out.println("- " + l.getName());
        System.out.println("Courses Offered:");
        if(coursesOffering.isEmpty()) System.out.println("None");
        else for(Course c : coursesOffering) System.out.println("- " + c.getName());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if(departmentHead != null) departmentHead.displayInfo();
        else System.out.println("No department head.");
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }
}

