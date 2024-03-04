import java.util.Scanner;

public class Student_grade_calculator
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int num_of_subjects;
        float total_marks_obtained=0, avg_percentage;
        String grade=null;

        System.out.print("Enter number of subjects you have : ");
        num_of_subjects = sc.nextInt();

        float[] marks = new float[num_of_subjects];

        System.out.println("Enter individual subject marks one by one and hit 'Enter' respectively !");
        for(int i=0;i<num_of_subjects;i++)
        {
            System.out.print("Enter marks for subject "+(i+1)+" : ");
            marks[i]=sc.nextFloat();
            while(marks[i]<0 || marks[i]>100 )
            {
                System.out.println("Wrong input! Plzz enter it carefully.... It should be in range of 0 to 100");
                System.out.print("Enter marks for subject "+(i+1)+" : ");
                marks[i]=sc.nextFloat();
            }            
        }

        for(int i=0;i<num_of_subjects;i++)
        {
            total_marks_obtained = total_marks_obtained + marks[i];
        }

        avg_percentage=total_marks_obtained/num_of_subjects;

        if(avg_percentage>=90)
        {
            grade="A+ (Outstanding)";
        }
        else if(avg_percentage>=80 && avg_percentage<90)
        {
            grade="A (Excellent)";
        }
        else if(avg_percentage>=70 && avg_percentage<80)
        {
            grade="B+ (Very good)";
        }
        else if(avg_percentage>=60 && avg_percentage<70)
        {
            grade="B (Good)";
        }
        else if(avg_percentage>=50 && avg_percentage<60)
        {
            grade="C (Satisfactory)";
        }
        else if(avg_percentage>=40 && avg_percentage<50)
        {
            grade="D (Pass)";
        }
        else
        {
            grade="Fail";
        }
        
        System.out.println("Total marks obtained : "+total_marks_obtained);
        System.out.println("Average Percentage : "+avg_percentage);
        System.out.println("Grade : "+grade);
        sc.close();
    }
}