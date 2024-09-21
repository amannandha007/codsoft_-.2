
import java.util.Scanner;


public class Gradecalc 
{
    public static void main(String[] args) 
    {
     Scanner scan = new Scanner(System.in);
     
     //enter totel number
     System.out.println("enter totel number of subject");
     int numsubjects = scan.nextInt();

     int totelmarks = 0;

     for(int i=1;i<=numsubjects;i++)
     {
        System.out.println("enter marks for subject "+ i + "out of 100:");
        int marks = scan.nextInt();
       // input validation
        while(marks < 0 || marks > 100)
        {
         System.out.println("invalid marks.please enter marks between 0 & 100"); 
         System.out.println("enter marks for subject" + i +"out of 100");
         marks = scan.nextInt();  
        }
        totelmarks += marks;
    }  
    System.out.println("student result");
    System.out.println("totel marks in all student :"+ totelmarks);

    int averagepercentage = totelmarks / numsubjects;
    System.err.println("average percentage :"+ averagepercentage);

    if(averagepercentage >= 90)
    {
        System.err.println("your grade: A+ ");
    }
    else if(averagepercentage >= 80)
    {
        System.err.println("your grade: B+ ");
    }
    else if(averagepercentage >= 70)
    {
        System.err.println("your grade: B ");
    }
    else if(averagepercentage >= 60)
    {
        System.err.println("your grade: C+ ");
    }
    else if(averagepercentage >= 50)
    {
        System.err.println("your grade: C ");
    }
    else if(averagepercentage >= 40)
    {
        System.err.println("your grade: D+ ");
    }
    else if(averagepercentage >= 30)
    {
        System.err.println("your grade: D ");
    }
    else
    {
        System.err.println("your grade is E");
    }


    scan.close();
    }   
}
