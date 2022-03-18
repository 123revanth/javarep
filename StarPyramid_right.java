import java.util.*;

public class java {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows");
     int rows = sc.nextInt();

     for(int i = 1; i <= rows; i++){
       for(int j = rows - i; j > 0; j--){
          System.out.print(" ");
       }
       for(int l = 1; l <= i; l++){
          System.out.print("*");
       }
       System.out.println(" ");
     }

    }
  }
