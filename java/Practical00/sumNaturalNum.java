import java.util.Scanner;

public class sumNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth Natural Num : ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter vaild input..");
        }else {
            int sum = num * (num + 1) / 2;
            System.out.print("Sum of n Numbers : "+ sum);
        }
    }
}
