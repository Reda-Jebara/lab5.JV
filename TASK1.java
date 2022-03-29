public class TASK1
{
    public static void main(String[] args) {
        int[] nums = new int[10];
        int i;
        for (i = 0; i < nums.length; i++)
        {
            nums[i] = nums.Length- i-1;
            for (int array : nums)
            {
                System.out.println(array);
            }
        }
    }
}