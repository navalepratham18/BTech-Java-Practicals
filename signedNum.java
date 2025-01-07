import java.util.Scanner;

public class signedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        String num = sc.next();

        if (num.charAt(0) == '-'){
            System.out.println(num+ " is a Negative Number");
        } else if (num.charAt(0) == '0') {
            System.out.println(num + " is a Zero");
        }else {
            System.out.println(num + " is a Positive Number");
        }

    }
}
