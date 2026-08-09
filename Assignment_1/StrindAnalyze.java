import java.util.Scanner;
public class StrindAnalyze {
    public static void analyzeString(String sentence, char targetChar) {
        String trimmedSentence = sentence.trim();

        String[] words = trimmedSentence.split("\\s+");
        int wordCount = words.length;

        int firstSpaceIdx = trimmedSentence.indexOf(' ');
        String firstWord = (firstSpaceIdx != -1) ? trimmedSentence.substring(0, firstSpaceIdx) : trimmedSentence;

        int lastSpaceIdx = trimmedSentence.lastIndexOf(' ');
        String lastWord = (lastSpaceIdx != -1) ? trimmedSentence.substring(lastSpaceIdx + 1) : trimmedSentence;

        int firstCharIndex = sentence.indexOf(targetChar);
        int lastCharIndex = sentence.lastIndexOf(targetChar);

        int comparison = firstWord.compareTo(lastWord);

        char[] charArray = sentence.toCharArray();
        char firstChar = sentence.charAt(0);
        int asciiVal = (int) firstChar;
        String asciiString = String.valueOf(asciiVal);

        System.out.println("Input                            : \"" + sentence + "\"");
        System.out.println("Word Count                       : " + wordCount);
        System.out.println("First Word                       : " + firstWord);
        System.out.println("Last Word                        : " + lastWord);
        System.out.println("First '" + targetChar + "' index                     : " + firstCharIndex);
        System.out.println("Last '" + targetChar + "' index                      : " + lastCharIndex);
        System.out.println("Comparison (first vs last word)  : " + comparison);
        System.out.println("First Char ASCII (via valueOf)   : " + asciiString + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence to analyze: ");
        String sampleSentence = sc.nextLine();
        analyzeString(sampleSentence, 'J');
    }
}
