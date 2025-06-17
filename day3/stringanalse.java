import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");
        int wordCount = (input.trim().isEmpty()) ? 0 : words.length;

        
        int charCount = 0;
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                charCount++;
            }
        }

        
        String reversed = new StringBuilder(input).reverse().toString();

        
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Word count: " + wordCount);
        System.out.println("Character count (excluding spaces): " + charCount);
        System.out.println("Reversed string: " + reversed);
        System.out.println("Longest word: " + longestWord);

        scanner.close();
    }
}
