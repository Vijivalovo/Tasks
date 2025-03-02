import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class TwoSum
{
    public static int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];

            if (map.containsKey(complement)) 
            {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No solution found");
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

        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();

        try
        {
            int[] result = TwoSum.twoSum(nums, target);
            System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}