import java.util.Scanner;
class TextNormalizer {
    public static String normalize(String input) {
        if (input == null) {
            return "EMPTY_STRING";
        }

        String trimmed = input.trim();
        String cleaned = trimmed.strip();

        if (cleaned.isEmpty()) {
            return "EMPTY_STRING";
        }

        if (cleaned.equalsIgnoreCase("admin") || cleaned.toLowerCase().equals("admin")) {
            return "RESERVED_WORD";
        }

        String replaced = cleaned.replace("_", " ");

        String lowerCaseStr = replaced.toLowerCase();
        if (lowerCaseStr.startsWith("temp") && lowerCaseStr.endsWith("user")) {
            // Append "_FLAGGED" using concat()
            return replaced.concat("_FLAGGED");
        }

        return replaced;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to normalize: ");
        String input = sc.nextLine();
        String normalized = normalize(input);
        System.out.println("Normalized string: " + normalized);
    }

}



