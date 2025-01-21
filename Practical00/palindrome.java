import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String word = sc.nextLine();

        String updatedWord = word.replaceAll(" ", "");
        boolean isPalindrome = false;

        int wordLength = word.length();

        for(int i = 0; i <= wordLength /2 ; i++){
            if (updatedWord.charAt(i) != updatedWord.charAt(wordLength - i - 1)){
                break;
            }else {
                isPalindrome = true;
            }
        }

        if(isPalindrome){
            System.out.println(word + " is a Palindrome");
        }else{
            System.out.println(word + " is not a Palindrome");
        }
    }
}
