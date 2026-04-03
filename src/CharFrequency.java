    
import java.util.Scanner;

public class CharFrequency {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the full string S
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();

        // Read the character C
        // scanner.next() gets the next token, charAt(0) gets the character
        if (!sc.hasNext()) return;
        char target = sc.next().charAt(0);

        int count = 0;

        // Loop through the string and compare each character
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }

        // Print the final count
        System.out.println(count);
        
        sc.close();
    }
}