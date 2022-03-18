import java.util.*;

public class java {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number to start");
     int start = sc.nextInt();

     System.out.println("Enter the number to end");
     int end = sc.nextInt();
     int counter = 0;

     if(start == 1) start = start + 1;

     System.out.println("_____________________________");

     for(int i = start; i <= end; i++){
       for(int j = 2; j < i; j++){
         if(i % j == 0){
           counter = 1;
           break;
         }
       }
       if(counter != 1){
        System.out.println(i);
      }
      counter = 0;
     }

    }
  }
