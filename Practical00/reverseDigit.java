import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp_num = num;

        int upd_num = 0;

        while (num != 0){
            int digit = num % 10;
            upd_num = upd_num  * 10 + digit;
            num /= 10;
        }
        System.out.println("Original Num : "+ temp_num +"\nReverse Num : "+ upd_num);
    }
}
