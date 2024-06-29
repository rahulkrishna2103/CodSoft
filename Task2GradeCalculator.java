import java.util.Scanner;
public class Task2GradeCalculator{
    public static void main(String[] args)
    {
        int TotalMarks=0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator \n");
        System.out.print("Enter total no.of subjects: ");
        int TotalSubject = sc.nextInt();
        int[] arr = new int[TotalSubject];
        System.out.println("Enter The Marks in each Subject out of 100 :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            TotalMarks += arr[i];
        }
        float average = TotalMarks/TotalSubject;
        if(average >=90 && average <=100)
        {
            result = "S";
        }
        else if(average >=80 && average <90)
        {
            result = "A";
        }
        else if(average >=70  && average <80 )
        {
            result = "B";
        }
         else if(average >=60  && average <70 )
        {
            result = "C";
        }
         else if(average >=50  && average <60 )
        {
            result = "D";
        }
        else{
            result = "F";
        }
        System.out.println("Total Marks = "+TotalMarks);
        System.out.println("Average Percentage = "+average);
        System.out.println("Grade = "+result);
        sc.close();
    }
}