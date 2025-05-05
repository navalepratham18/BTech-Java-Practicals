import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Num : ");
        int num = sc.nextInt();
        boolean isprime = true;

        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if( num % i == 0){
                isprime = false;
                break;
            }
        }

        if (isprime) {
            System.out.println(num +" is a prime Number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}
