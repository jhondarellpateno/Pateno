package activity1;

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        
        String name;
        int subject;
        float average;
        int total = 0;
        String remarks;
        
        System.out.print("Enter student name: ");
        name = grade.nextLine();
        System.out.print("Enter number of subjects: ");
        subject = grade.nextInt();
        
        for(int x = 1; x <= subject; x++){
            System.out.print("Enter grade for sub " +x+ ":");
            total += grade.nextInt();
            System.out.println("");
        }
            System.out.println("");
            average = (float) total / (float) subject;
            
            if(average >= 75){
                remarks = "PASSED";
            }else{
                remarks = "FAILED";
            }
            
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Remarks: " +remarks);
        
    }
    
}
