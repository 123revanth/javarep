import java.util.*;

public class java {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    char YorN = 'y';

    int num1 = 0;
    int cointainer = 0;
    int greatest = 0;

    System.out.print("Enter The number:");
    num1 = sc.nextInt();
    int smallest = num1;
    if(num1 > cointainer) greatest = num1;
    else {
      if(smallest > num1) smallest = num1; 
    }
    cointainer = num1;

    while(YorN == 'y'){
      System.out.print("Enter The number:");
      num1 = sc.nextInt();
      if(num1 > cointainer) greatest = num1;
      else {
        if(smallest > num1) smallest = num1; 
      }
      cointainer = num1;
      
      System.out.println("Do you want to contine(y/n)");
      YorN = sc.next().charAt(0);

    }

    System.out.println("Largest number in the list:" + greatest);
    System.out.println("Smallest number in the list:" + smallest);


    }
  }
