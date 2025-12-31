package LW_03.Q4;

public class Main {
    public static void main(String[] args) {

        Lecturer lec = new Lecturer();
        lec.setLecturerName("Dr. Perera");
        lec.setCourseTeaching("Object Oriented Programming");

        Course course = new Course();
        course.setCourseName("Object Oriented Programming");
        course.setCourseCode("CS21032");
        course.setLecturer(lec);

        Student stu = new Student();
        stu.setStudentName("Navindu");
        stu.setDegreeName("BSc in IT");
        stu.setCourseFollowing(course.getCourseName());

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("Student: " + stu.getStudentName());
        System.out.println("Degree: " + stu.getDegreeName());
        System.out.println("Course Following: " + stu.getCourseFollowing());
    }
}
