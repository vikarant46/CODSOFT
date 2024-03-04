package student_course_registration_system;

import java.util.ArrayList;
import java.util.List;

public class Registration_system 
{
    List<Course_database> courses;
    List<Student_database> students;

    public Registration_system()
    {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course_database course)
    {
        courses.add(course);
    }

    public void addStudent(Student_database student)
    {
        students.add(student);
    }

    //Method for displaying list of courses
    public void displayCourses()
    {
        System.out.println("\nAvailable Courses :- \n");
        for(Course_database course : courses)
        {
            System.out.println(course.code+" :- "+course.title+"\nDescription : "+course.description+"\nAvailable slots : "+course.capacity+"\nSchedule : "+course.schedule+"\n");
        }
    }

    public Student_database isValidStudent(String studentid)
    {
        for(Student_database student:students)
        {
            if(studentid.equals(student.studentID))
            {
                return student;
            }
        }
        return null;
    }

    public Course_database isValidCourse(String courseCode)
    {
        for(Course_database course:courses)
        {
            if(courseCode.equals(course.code))
            {
                return course;
            }
        }
        return null;
    }

    public boolean viewEnrolledCourse(Student_database student)
    {
        if(student.registeredCourses.isEmpty())
        {
            return false;
        }
        else
        {
            System.out.println("You are enrolled in : ");
            for(Course_database course:student.registeredCourses)
            {
                System.out.println(course.code+" : "+course.title);
            }
            return true;
        }
    }

    public void enrollCourse(Student_database student, Course_database course)
    {
        if(student.registeredCourses.contains(course))  // Checking if course is already enrolled or not
        {
            System.out.println("You are already enrolled in -> "+course.code+" : "+course.title);
        }
        else
        {
            if(course.capacity>0)
            {
                student.registeredCourses.add(course);
                course.capacity--;
                System.out.println("Succesfully enrolled in "+course.title);
            }
            else
            {
                System.out.println("Sorry ! all slots are full");
            }
        }
    }

    public void dropCourse(Student_database student ,Course_database course)
    {
        if(student.registeredCourses.contains(course))
        {
            student.registeredCourses.remove(course);
            course.capacity++;
            System.out.println("Succesfully unenrolled "+course.code+" : "+course.title);
        }
        else
        {
            System.out.println("you are not already enrolled in "+course.code+" : "+course.title);
        }
    }

}