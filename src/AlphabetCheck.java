import java.util.Locale;
import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the symbol");
        char symbol = sc.next().charAt(0);

        if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) { // the char variable stores the ASCII value of a character with if we check ASCII values
            System.out.println(symbol + " is a character");
            if (symbol >= 'a' && symbol <= 'z') {
                char upper = Character.toUpperCase(symbol);
                System.out.println("Converted to Upper case: " + upper);

            } else {
                char lower = Character.toLowerCase(symbol);
                System.out.println("Converted to Lower case: " + lower);

            }
        } else {
            System.out.println(symbol + " is not a character");
        }

    }
}
