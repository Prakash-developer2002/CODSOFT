import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        result_calculator();
    }   
    public static void result_calculator()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Number of Subjects in the Class are :");
         int Total_Subject_count =sc.nextInt();
         System.out.println("Total subjects are "+Total_Subject_count);
          int Total_marks=0;
         for(int i=1 ;i<=Total_Subject_count;i++) // user will descide number of subject.
         {
           
             System.out.println("Enter "+i+"st subject name :");
             String subject =  sc.next();
             System.out.println("the subject name is :" + subject);
             System.out.println("Enter marks for "+subject);
             int marks=sc.nextInt();
             
            
             System.out.println("Subject name :" + subject+ "Marks obtained :"  +marks);
             Total_marks =Total_marks+ marks;   
         }
         System.out.println("the total marks is :"+Total_marks);
         int average_percentage =(Total_marks/Total_Subject_count);
         System.out.println("the average Percentage is :"+average_percentage);
         String grade;

        if (average_percentage >= 90) {
            grade = "A";
        } else if (average_percentage >= 80) {
            grade = "B";
        } else if (average_percentage >= 70) {
            grade = "C";
        } else if (average_percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("the grade is: " + grade);
        sc.close();
    } 
}
