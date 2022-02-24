import java.util.*;

public class java {
   public static void Oddprint(int num1, int num2){
     for(int i = num1; i <= num2; i++){
       if(i%2 == 1)  System.out.println(i);
     }
    }

    public static void Evenprint(int num1, int num2){
      for(int i = num1; i <= num2; i++){
        if(i%2 == 0)  System.out.println(i);
      }
     }

    public static void PrimeORnot(int num1){
      int checker = 0;  
          for(int i = 2; i < num1; i++){
             if(num1 % i == 0){
               checker = 1;
             }
          }
          if(checker == 0) System.out.println(num1);
        }

    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int num1 = 0;
      int num2 = 0;
      int cointainer = 0;

      while(cointainer == 0 || cointainer == 1 || cointainer == 2 || cointainer == 3){
         System.out.println("Enter the choice, (1 - for odd numbers in the range, 2 - even numbers in the range, 3 - prime numbers in the range)");
         cointainer = sc.nextInt();

         System.out.println("Enter the staring of the range");
         num1 = sc.nextInt();

         System.out.println("Enter the ending of the range");
         num2 = sc.nextInt();

         System.out.println("_________________________________");

         switch(cointainer){
           case (1):
             Oddprint(num1, num2);
             break;
           case (2):
             Evenprint(num1, num2);
             break;
           case (3):
            for(int i = num1; i <= num2; i++){
                PrimeORnot(i);
            }
            break;

          default: System.out.println("Entered invalid option");
         }
      }

    }
  }
