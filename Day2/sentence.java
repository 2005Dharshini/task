import java.util.Scanner;

public class SentenceSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

       
        String[] words = sentence.split("\\s+");

        System.out.println("The words in the sentence are:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
