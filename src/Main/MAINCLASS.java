package Main;

import java.util.Scanner;
import banking.bankApp;

public class MAINCLASS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int attempt = 3;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                while (attempt != 0){
                    
                    bankApp bc = new bankApp();

                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();

                        if(bc.verifyAccount(accountNo, pin)){
                            System.out.println("LOGIN SUCCESS");
                            System.exit(0);
                        }else{
                            attempt --;
                            System.out.println("Invalid Account and Pin, You have " +attempt+ "Left!");
                        }
                        
                       
                }
                       
                   if (attempt == 0);
                        System.out.println("Try again later bossing!");
        
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
    
}
