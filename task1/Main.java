import java.util.Scanner;

class Polindrome
{
    public boolean isPolindrome(int x)
    {
        if (x < 0) return false;

        int orig = x;
        int reversed_num = 0;

        while(x > 0)
        {
            reversed_num = reversed_num * 10 + x % 10;
            x /= 10;
        }

        return orig == reversed_num;
    }
}

public class Main {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        Polindrome poli = new Polindrome();

        System.out.println(poli.isPolindrome(number));

        scanner.close();
    }
}
