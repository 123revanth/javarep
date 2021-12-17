import java.util.Scanner;

public class javaclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        int numberofelectiontowait = 0;

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            {
                System.out.println("you are not eligible to vote now");
                numberofelectiontowait = (18 - age) / 5 - 1;
            }
        }

        System.out.println("you can vate after " + numberofelectiontowait + " elections");

    }
}
