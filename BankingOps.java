import java.util.*;

public class java {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int choice = 1;

      int Balance = 0;

      int cointainer = 0;

      while(choice == 1 || choice == 2 || choice == 3){
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");

        System.out.println("Enter your Choice (1,2,3) or enter 0 to quit");
        choice = sc.nextInt();
        
        switch(choice){
            case (1):
                System.out.println("Amount to deposit");
                cointainer = sc.nextInt();
                Balance = Balance + cointainer;
                System.out.println("-------------------------------------------------");
                break;
            
            case (2):
              System.out.println("Amount to withdraw");
              cointainer = sc.nextInt();
              Balance = Balance - cointainer;
              System.out.println("-------------------------------------------------");
              break;

            case (3):
              System.out.println("Your Balance");
              System.out.println("$" + Balance);
              System.out.println("-------------------------------------------------");
              break;

            default: System.out.println("Bye !");
            
        System.out.println("-------------------------------------------------");

            cointainer = 0;
            
        }
           
      }
    }
  }
