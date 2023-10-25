import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkPangram(String input) {
        input = input.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (input.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
}