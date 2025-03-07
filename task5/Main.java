import java.util.Scanner;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
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
            int result = Solution.searchInsert(nums, target);
            System.out.println("Indices of the two numbers:" + result);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
