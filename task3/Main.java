import java.util.Scanner;

 class SingleNumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
            System.out.println("function" + result + num);
        }
        return result;
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
            int result = SingleNumber.findSingleNumber(nums);
            System.out.println("Result:" + result);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }   
}
