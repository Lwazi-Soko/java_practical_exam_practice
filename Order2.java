import java.util.*;
import java.io.*;

public class Order2 {
    public static void main(String[] args) {
        System.out.println("Enter the name of the word lists text file:");
        Scanner scanner = new Scanner(System.in);
        Scanner file = null;

        try {
            file = new Scanner(new FileInputStream(scanner.nextLine()));
        } catch (FileNotFoundException e) {
            System.out.println("Could not read in file!");
            return; // Exit if file not found
        }

        while (file.hasNextLine()) {
            String[] words = file.nextLine().trim().split("\\s+");

            if (words.length == 1) {
                System.out.println("Longest is 1.");
                continue;
            }

            int maxLength = 1;
            int currentLength = 1;
            int solutionCount = 1;

            for (int i = 1; i < words.length; i++) {
                if (words[i - 1].compareToIgnoreCase(words[i]) <= 0) {
                    currentLength++;
                } else {
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        solutionCount = 1;
                    } else if (currentLength == maxLength) {
                        solutionCount++;
                    }
                    currentLength = 1;
                }
            }

            // Final check in case the longest sequence is at the end
            if (currentLength > maxLength) {
                maxLength = currentLength;
                solutionCount = 1;
            } else if (currentLength == maxLength) {
                solutionCount++;
            }

            if (solutionCount > 1) {
                System.out.println("Multiple solutions length " + maxLength + ".");
            } else {
                System.out.println("Longest is " + maxLength + ".");
            }
        }

        System.out.println("Done");
    }
}
