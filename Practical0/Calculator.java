import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 :");
        int num1 = sc.nextInt();

        System.out.print("Enter Num2 : ");
        int num2 = sc.nextInt();

        System.out.println("Sum : "+(num1+num2));

        System.out.println("Difference : "+ (num1- num2));

        System.out.println("Product : " + (num1 * num2));

        if (num2 == 0) {
            System.out.println("Invalid Result");
        }else{
            float res = num1 / num2;
            System.out.println("Division : " + res);
        }

    }
}
