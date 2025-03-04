import java.util.Scanner;
import java.util.HashSet;

class ContainsDuplicate
{
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

public class Main 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            nums[i] = scanner.nextInt();
        }

        try
        {
            Boolean result = ContainsDuplicate.containsDuplicate(nums);
            System.out.println("Result:" + result);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }   
}
