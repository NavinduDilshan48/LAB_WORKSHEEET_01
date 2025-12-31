package LW_05.Q2;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department softwareDept = new Department("Software Engineering");
        Degree csDegree = new Degree("Computer Science", 120);
        Lecturer lecturer1 = new Lecturer("Dr. John Smith", "Senior Lecturer", softwareDept);
        Student student1 = new Student("Alice Brown", "S123", "Year 2", csDegree);
        Course oopCourse = new Course("Object-Oriented Programming", "Mandatory", lecturer1, csDegree);

        softwareDept.addLecturer(lecturer1);
        softwareDept.offerCourse(oopCourse);
        softwareDept.appointDepartmentHead(lecturer1);

        lecturer1.addCourse(oopCourse);
        csDegree.offerCourse(oopCourse);
        student1.enrollCourse(oopCourse);

        System.out.println("===== Department Info =====");
        softwareDept.displayInfo();
        System.out.println("===== Lecturer Info =====");
        lecturer1.displayInfo();
        System.out.println("===== Student Info =====");
        student1.displayInfo();
        System.out.println("===== Degree Info =====");
        csDegree.displayInfo();
        System.out.println("===== Course Info =====");
        oopCourse.displayInfo();
    }
}

