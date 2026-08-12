public class TextFormatter {
    public static String toTitleCase(String name) {
        if (name == null || name.isBlank()) return "";
        String[] words = name.split("\\s+");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String first = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                titleCase.append(first).append(rest).append(" ");
            }
        }
        return titleCase.toString().trim();
    }

    public static String maskEmail(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex <= 3) return email;

        String prefix = email.substring(0, 3);
        int maskLength = atIndex - 3;
        String maskedPart = "*".repeat(maskLength);
        String domain = email.substring(atIndex);

        return prefix + maskedPart + domain;
    }

    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.isBlank()) return "";
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder reversedWord = new StringBuilder();
            for (int i = chars.length - 1; i >= 0; i--) {
                reversedWord.append(chars[i]);
            }
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim().toLowerCase();
    }

    public static int countVowels(String sentence) {
        int count = 0;
        String lower = sentence.toLowerCase();
        for (char c : lower.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String fullName = "john WICK";
        String email = "john.wick@example.com";
        String sentence = "Hello World From Java";

        String formattedName = toTitleCase(fullName);

        String maskedEmail = maskEmail(email);
        boolean isValidEmail = email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

        String reversedWords = reverseWords(sentence);

        int vowelCount = countVowels(sentence);

        String str1 = new String();
        String str2 = new String();
        boolean isReferenceEqual = (str1 == str2);
        boolean isContentEqual = str1.equals(str2);

        System.out.println("Formatted Name : " + formattedName);
        System.out.println("Masked Email   : " + maskedEmail);
        System.out.println("Valid Email    : " + isValidEmail);
        System.out.println("Reversed Words : " + reversedWords);
        System.out.println("Vowel Count    : " + vowelCount);
        System.out.println("Reference Equal (==)      : " + isReferenceEqual);
        System.out.println("Content Equal (.equals()) : " + isContentEqual);
    }
    
}
