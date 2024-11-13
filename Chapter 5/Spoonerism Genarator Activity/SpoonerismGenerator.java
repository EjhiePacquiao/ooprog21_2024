import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        Run.run();
    }

    //  get a word
    public static String getWord(String wordNumber) {
        Scanner scanner = new Scanner(System.in);
        String word;

        // Loop para valid word and errs
        while (true) {
            System.out.print("Enter " + wordNumber + ": ");
            word = scanner.nextLine().trim();

            // Check if the word is empty
            if (word.isEmpty()) {
                System.out.println("Error: Input cannot be empty. Please enter a valid word.");
            }
            // Check if the word contains any digits
            else if (word.matches(".*\\d.*")) {
                System.out.println("Error: Input cannot contain numbers. Please enter a valid word.");
            }
            // if checks, return 
            else {
                return word;
            }
        }
    }}
