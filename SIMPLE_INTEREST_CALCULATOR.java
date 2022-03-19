import java.util.*;

public class java {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the principle in Rs:");
     int principle = sc.nextInt();

     System.out.print("Enter the rate in %:");
     double rate = sc.nextDouble();

     System.out.println("Choose the period for your loan:");
     System.out.println("A. 5 years");
     System.out.println("B. 7 years");
     System.out.println("C. 9 years");
     System.out.println("D. 13 years");

     System.out.print("Enter your choice(A-D):");
     char option = sc.next().charAt(0);

     double interest = 0;
     int time = 0;

     switch(option){
       case ('A'):
       interest = (principle * rate * 5)/100;
       time = 5;
       break;
       case ('B'):
       interest = (principle * rate * 7)/100;
       time = 7;
       break;
       case ('C'):
       interest = (principle * rate * 9)/100;
       time = 9;
       break;
       case ('D'):
       interest = (principle * rate * 13)/100;
       time = 13;
       break;
       default:
       System.out.println("Invalid Entry");
     }

     System.out.println("********************SIMPLE INTEREST CALCULATOR**********************");
     System.out.println("Principle in Rupees:" + principle);
     System.out.println("Interest rate in %" + rate);
     System.out.println("Time duration in Years:" + time);
     System.out.println("Simple interest in Rupees:" + interest);
     System.out.println("Total amount to be repaid in Rupees:" + (interest + principle));
     System.out.println("**********************************************************************");

     }
     }
