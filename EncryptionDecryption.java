import java.util.Scanner;

public class EncryptionDecryption {

    // Method to reverse the order of words in a sentence
    private static String reverseWordOrder(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    // Method to decompress adjacent repeated letters in a word
    private static String decompressRepeatedLetters(String word) {
        StringBuilder decompressedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (i < word.length() - 1 && Character.isDigit(word.charAt(i + 1))) {
                int count = Character.getNumericValue(word.charAt(i + 1));
                for (int j = 0; j < count; j++) {
                    decompressedWord.append(currentChar);
                }
                i++; // skip the digit
            } else {
                decompressedWord.append(currentChar);
            }
        }
        return decompressedWord.toString();
    }

    // Method to decrypt the message
    private static String decryptMessage(String encryptedMessage) {
        // Reverse the order of words in the sentence
        String reversedWordOrderSentence = reverseWordOrder(encryptedMessage);
        
        // Split the sentence into words
        String[] words = reversedWordOrderSentence.split("\\s+");
        
        // Decompress each word and build the final decrypted message
        StringBuilder decryptedMessage = new StringBuilder();
        for (String word : words) {
            decryptedMessage.append(decompressRepeatedLetters(word)).append(" ");
        }

        return decryptedMessage.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the encrypted message: ");
        String encryptedMessage = scanner.nextLine();

        String decryptedMessage = decryptMessage(encryptedMessage);

        System.out.println("Decrypted message: " + decryptedMessage);

        scanner.close();
    }
}
