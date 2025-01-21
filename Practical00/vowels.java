import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vowels = 0;
        System.out.print("Enter a word : ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char updatedWord = word.charAt(i);

            if( updatedWord == 'a' || updatedWord == 'e' || updatedWord == 'i' || updatedWord == 'o' || updatedWord == 'u'){
                vowels += 1;
            }
        }
        System.out.println(word + " contains, " + vowels + " Vowels.");
    }
}
