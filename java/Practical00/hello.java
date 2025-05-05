import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>18){
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("yor are not eligible for voting");
        }
    }
}