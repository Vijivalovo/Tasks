import java.util.Scanner;

import java.util.Stack;

class Solution {
    public static int longest(String s) {
        int maxLength = 0;
        int currentLength = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                currentLength += 2;
                maxLength = Math.max(maxLength, currentLength);
                i++;
            } else {
                currentLength = 0;
            }
        }
        
        return maxLength;
    }
}

public class Main 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String x = scanner.next();


        try
        {
            int result = Solution.longest(x);
            System.out.println("Result:" + result);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }   
}
