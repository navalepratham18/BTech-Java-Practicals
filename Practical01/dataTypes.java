package Practical01;

import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // data input
        System.out.print("Enter any Integer Value : ");
        int IntVal = sc.nextInt();

        System.out.print("Enter any Floating Point Value : ");
        float FloatVal = sc.nextFloat();

        System.out.print("Enter any Character Value : ");
        char charVal = sc.next().charAt(0);

        System.out.print("Enter any Boolean Value (True/False): ");
        boolean boolVal = sc.nextBoolean();

        // data output
        System.out.println("\nEnter data is as follows: ");
        System.out.println("Entered Integer Value : "+ IntVal);
        System.out.println("Entered Floating POint Value : " + FloatVal);
        System.out.println("Entered Charater Value : "+ charVal);
        System.out.println("Entered Boolean Expression : " + boolVal);


    }
}
