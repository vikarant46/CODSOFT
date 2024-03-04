package student_course_registration_system;

import java.util.ArrayList;
import java.util.List;

public class Student_database 
{
    String studentID;
    String name;
    List<Course_database> registeredCourses;

    public Student_database(String studentID, String name)
    {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }
}
