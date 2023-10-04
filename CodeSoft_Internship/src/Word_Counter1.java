import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Word_Counter1 {
	public static void main(String[] args) {
        System.out.print("Enter '1' to enter text manually or '2' to provide a file: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        
        if (choice == 1) {
            System.out.print("Enter the text: ");
            String text = sc.nextLine();
            String[] words = splitText(text);
            int wordCount = 0; // Initialize the counter variable

            System.out.println("Words in the input:");
            for (String word : words) {
                System.out.println(word);
                wordCount++; // Increment the counter for each word encountered
            }

            System.out.println("Total number of words: " + wordCount); // Display the word count
        } 
        else if (choice == 2){
            try {
                System.out.print("Enter the file name: ");
                String fileName = sc.nextLine();
                String text = readTextFromFile(fileName);
                String[] words = splitText(text);
                int wordCount = 0; // Initialize the counter variable

                System.out.println("Words in the file:");
                for (String word : words) {
                    System.out.println(word);
                    wordCount++; // Increment the counter for each word encountered
                }

                System.out.println("Total number of words: " + wordCount); // Display the word count
            } 
            catch (IOException e) {
                System.out.println("File not found or an error occurred.");
            }
        } 
        else {
            System.out.println("Invalid choice. Please enter '1' or '2'.");
        }

       sc.close();
    }
    public static String[] splitText(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, " \t\n()*+,-./:;");
        int numTokens = tokenizer.countTokens();
        String[] words = new String[numTokens];

        for (int i = 0; i < numTokens; i++) {
            words[i] = tokenizer.nextToken();
        }

        return words;
    }

    public static String readTextFromFile(String fileName) throws IOException {
        StringBuilder textBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            textBuilder.append(line);
            textBuilder.append("\n");
        }

        reader.close();
        return textBuilder.toString();
    }

    
}
