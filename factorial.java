import java.util.Scanner;

public class factorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int fact = 1;

        if (num < 0) {
            System.out.println("Invalid numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + num + " is: " + fact);
        }
    }
}
