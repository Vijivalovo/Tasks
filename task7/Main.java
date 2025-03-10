import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
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
            List<List<Integer>> result = Subsets.subsets(nums);
            System.out.println("Result:" + result);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }   
}