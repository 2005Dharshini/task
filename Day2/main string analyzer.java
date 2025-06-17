import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
 String[] words = sentence.split("\\s+");

       
        int wordCount = words.length;

        
        int charCount = 0;
        for (char c : sentence.toCharArray()) {
            if (c != ' ') {
                charCount++;
            }
        }

        
        String reversed = new StringBuilder(sentence).reverse().toString();

        
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        
        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count (excluding spaces): " + charCount);
        System.out.println("Reversed Sentence: " + reversed);
        System.out.println("Longest Word: " + longestWord);

        scanner.close();
    }
}
