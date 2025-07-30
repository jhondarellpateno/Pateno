

package activity1;

import java.util.Scanner;


public class activity2 {
    
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        
        String name;
        float rate;
        int hour;
        
        System.out.print("Enter employee name: ");
        name = salary.nextLine();
        
        System.out.print("Enter hourly rate: ");
        rate = salary.nextFloat();
        
        System.out.print("Enter total hours worked this week: ");
        hour = salary.nextInt();
        
        System.out.println("----Wage Summary----");
        
        System.out.println("Employee: " + name);
        System.out.printf("Hourly Rate: ₱%.2f\n", rate);
        System.out.println("Hours Worked: " + hour);
        
        float wage = rate * hour;
        
        System.out.printf("Gross Weekly Wage: %.2f\n", wage);
        System.out.printf("SSS Contribution(10%%): ₱%.2f\n", wage * (float) 0.1);
        System.out.println("------------------------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f", (wage - (wage * 0.1)));
        
        
    }
    
    
    
}
