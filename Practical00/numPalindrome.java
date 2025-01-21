import java.util.Scanner;

public class numPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        int temp_num = num;

        int upd_num = 0;

        while (num != 0){
            int digit = num % 10;
            upd_num = upd_num  * 10 + digit;
            num /= 10;
        }

        if(temp_num == upd_num){
            System.out.println(temp_num+ " is a Palindrome");
        }else {
            System.out.println(temp_num + " is not a Palindrome");
        }
    }
}
