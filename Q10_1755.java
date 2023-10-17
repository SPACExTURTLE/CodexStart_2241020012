//Name - Anish Kumar Thella
//Registration number - 2241020012;
//problem link - https://cses.fi/problemset/task/1755/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q10_1755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = makePalindrome(input);
        System.out.println(result);
    }
    public static String makePalindrome(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        char oddChar = '\0';
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count % 2 == 1) {
                oddCount++;
                oddChar = c;
            }
        }

        if (oddCount > 1) {
            return "NO SOLUTION";
        }

        char[] palindrome = new char[s.length()];
        int left = 0;
        int right = s.length() - 1;

        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            while (count >= 2) {
                palindrome[left] = c;
                palindrome[right] = c;
                left++;
                right--;
                count -= 2;
            }
        }

        if (oddCount == 1) {
            palindrome[s.length() / 2] = oddChar;
        }

        return new String(palindrome);
    }

    
}
