package Java;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Pangram {
    /*
     Question: Check if the input is pangram or not. (A pangram is a sentence that contains all the
               alphabets from A to Z)
     */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:");
        final String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(final String input) {
        HashSet<Character> letterSet = new HashSet<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letterSet.add(c);
            }
        }

        return letterSet.size() == 26;
    }
}
