import java.util.*;

public class java {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Order minimum 2 pizzas :");


     System.out.println("1. Margherita ->Rs. 219");
     System.out.println("2. Farmhouse ->Rs. 419");
     System.out.println("3. Cheese n Corn ->Rs. 319");
    
     System.out.println("Enter 0 to quit");
     System.out.println("Enter an option:");
     int option = sc.nextInt();

     int Margherita =  0;
     int Farmhouse = 0;
     int corn = 0;
     double amount = 0;
     double discount = 0;

     switch(option){
       case (1):
       Margherita = Margherita + 1;
       break;

       case (2):
       Farmhouse = Farmhouse + 1;
       break;
      
       case (3):
       corn = corn + 1;
       break;

       default: System.out.println("Entered option does not exist");
      }

      System.out.println("Thank you. Choose the next option");

      while(option != 0){
        
        System.out.println("1. Margherita ->Rs. 219");
        System.out.println("2. Farmhouse ->Rs. 419");
        System.out.println("3. Cheese n Corn ->Rs. 319");
        
        System.out.println("Enter 0 to quit");
        System.out.println("Enter an option:");
        option = sc.nextInt();

        switch(option){
          case (1):
          Margherita = Margherita + 1;
          break;
   
          case (2):
          Farmhouse = Farmhouse + 1;
          break;
         
          case (3):
          corn = corn + 1;
          break;
   
          default: System.out.println("The option does not exist");

         }
      }

      System.out.println("******************************************");
      System.out.println("             The Pizza Bill:");
      amount = (Margherita*219);
      amount = amount + (Farmhouse*419);
      amount = amount + (corn*319);

      System.out.println("The total amount (Gross Amount) = Rs. " + amount);
      
      if(amount > 600 & amount <= 800){
          discount = amount;
          amount = .85*amount;
          discount = discount - amount;
      }
      else if(amount > 800){
        discount = amount;
        amount = 0.8 * amount;
        discount = discount - amount;
      }

    System.out.println("The discount Amount = Rs. " + discount);
    System.out.println("The amount after discount (The Net amount) = Rs. " + amount);

    System.out.println("******************************************");
    
    }
  }
