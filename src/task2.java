import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = s.nextLine();
        System.out.println("Enter the pattern to search for: ");
        String pattern = s.nextLine();
        bruteForce(pattern, text);
    }

    public static void bruteForce(String pattern, String text) {
        int i = 0;
        while (i <= (text.length() - pattern.length())) {
            int j = 0;
            while (j < pattern.length() && text.charAt(i) == pattern.charAt(j)) {
                j++;
                i++;
            }
            if (j == pattern.length()) {
                System.out.println("Pattern found at : " + i);
            }
            i = i - j + 1;
        }
    }
}

