package student_course_registration_system;
import java.util.Scanner;
public class Main 
{      
    public static void main(String[] arg)
    {
        Registration_system registrationsystem = new Registration_system();

        // Adding some sample courses
        registrationsystem.addCourse(new Course_database("CS404", "Introduction to Programming", "Basic programming concepts", 19, "Mon/Tue 9:00 AM"));
        registrationsystem.addCourse(new Course_database("MATH106", "Calculus", "Limits, derivatives, integrals", 25, "Wed/Thu 11:00 AM"));

        // Adding some sample students
        registrationsystem.addStudent(new Student_database("1001", "Adem Sharma"));
        registrationsystem.addStudent(new Student_database("1002", "Arun Patel"));

        Scanner sc = new Scanner(System.in);
        int user_choice;
        String studentid,courseCode;

        Student_database student;
        Course_database course;

        System.out.println("Welcome to the course registration system !\n");

        System.out.print("Enter your Student ID : ");
        while(true)
        {
            studentid = sc.nextLine();

            //Checking if given StudentID is valid or not
            student = registrationsystem.isValidStudent(studentid);

            if(student!=null)
            {
                System.out.println("Welcome "+student.name+" !");
                break;
            }
            else
            {
                System.out.print("Invalid Student Id  plzz try again ! : ");
            }
        }
        
        //User Interface
        while(true)
        {
            System.out.println("\n\nWhat operation do you want to perform ");
            System.out.println("<1> Display available courses \n<2> Enroll Course \n<3> Drop Course\n<4> View course list you are enrolled in\n<5> Exit");
            System.out.print("Choose an operation from 1-4 : ");
            user_choice = sc.nextInt();
    
            switch(user_choice)
            {
                case 1:
                    registrationsystem.displayCourses();
                    break;
                case 2:
                    registrationsystem.displayCourses();
                    System.out.print("Enter course code to enroll : ");
                    while(true)
                    {
                        courseCode = sc.next();

                        //Checking if given courseCode is valid or not
                        course = registrationsystem.isValidCourse(courseCode);

                        if(course!=null)
                        {
                            registrationsystem.enrollCourse(student, course);
                            break;
                        }
                        else
                        {
                            System.out.print("Invalid course code plzz try again : ");
                        }
                    }
                    break;
                case 3:
                    if(registrationsystem.viewEnrolledCourse(student)) //Displaying enrolled courses
                    {
                        System.out.print("Enter course code which u want to unenroll : ");
                        courseCode = sc.next();

                        //Checking if given courseCode is valid or not
                        course = registrationsystem.isValidCourse(courseCode);

                        if(course!=null)
                        {
                            registrationsystem.dropCourse(student ,course);
                        }
                        else
                        {
                            System.out.println("Invalid course code !");
                        }
                    }
                    else
                    {
                        System.out.println("\nYou are not enrolled in any of the courses !");
                    }
                    break;
                case 4:
                    if(!registrationsystem.viewEnrolledCourse(student))
                    {
                        System.out.println("\nYou are not enrolled in any of the courses !");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default : System.out.println("! Invalid input try again !");
            }
        }
        
    }    
}