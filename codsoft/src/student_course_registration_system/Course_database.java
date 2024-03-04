package student_course_registration_system;

public class Course_database 
{
    String code;
    String title;
    String description;
    int capacity;
    String schedule;

    public Course_database(String code, String title, String description, int capacity, String schedule)
    {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule =  schedule;
    }
}
