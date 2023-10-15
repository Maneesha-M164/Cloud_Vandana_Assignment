package Java;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RomanToInteger {
    /*
      Question: Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
    */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final List<Character> allowedValues = List.of('I', 'V', 'X', 'L', 'C', 'D', 'M');

        System.out.print(String.format("Enter a roman numeral (Allowed values are %s): ", allowedValues));

        final String romanNumeral = scanner.nextLine();

        if (validateInput(romanNumeral, allowedValues)) {
            System.out.println(String.format("The integer equivalent of '%s' is '%s'.", romanNumeral, romanToInteger(romanNumeral)));
        } else {
            System.out.println("Invalid input. Please enter a valid Roman numeral.");
        }

        scanner.close();
    }

    public static int romanToInteger(String s) {
        final HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanValues.get(s.charAt(i));

            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }

            prevValue = curValue;
        }

        return result;
    }

    public static boolean validateInput(final String romanNumeral, final List<Character> allowedValues) {
        for (char c : romanNumeral.toCharArray()) {
            if (!allowedValues.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
