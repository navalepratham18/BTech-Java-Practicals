import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num of term in fibonnaci Series : ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter vaild input..");
        }else {
            int num1 = 0, num2 = 1;

            for (int i = 0; i <= num; i++) {
                System.out.print(num1 +", ");

                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        }
    }
}
