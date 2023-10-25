import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        scanner.close();

        int result = romanToInteger(romanNumeral);
        if (result != -1) {
            System.out.println("Integer equivalent: " + result);
        } else {
            System.out.println("Invalid Roman numeral");
        }
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            if (!romanMap.containsKey(currentSymbol)) {
                return -1; // Invalid Roman numeral
            }
            int currValue = romanMap.get(currentSymbol);

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}