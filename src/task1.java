import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = s.nextLine();
        System.out.println(NN(text) + " and the length is " + NN(text).length());
    }

    public static String NN(String text) {
        String prefix = null, suffix = null;
        int len = text.length();
        for (int i = len / 2; i > 0; i--) {
            prefix = text.substring(0, i);
            suffix = text.substring(len - i);

            if (prefix.equals(suffix)) {
                //System.out.println("I am here");
                return suffix;
            }
        }
        return "not found";
    }
}

