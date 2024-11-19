public class task3 {
    static void countSamePrefixSuffix(String s, int n)
    {
        // Stores the prefix string
        String prefix = "";

        for(int i = 0; i < n - 1; i++)
        {
            // Add the current character to the prefix string
            prefix += s.charAt(i);

            // Store the suffix string
            String suffix = s.substring(n - 1 - i, n);

            System.out.print("Proper prefix: " + prefix + ", Proper suffix: " + suffix);

            // Check if both the strings are equal or not
            if (prefix.equals(suffix))
            {
                System.out.print(" *"+ prefix.length());
            }

            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        String S = "ABCAABC";
        int N = S.length();
        for (int i = 0; i!= N; i++) {

            String sub = S.substring(0, i);
            System.out.println("Substring is: "+sub);

            int len = sub.length();

            countSamePrefixSuffix(sub, len);

        }
    }

}
