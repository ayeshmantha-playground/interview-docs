package finding_the_minimum_number;

public class AppInitializer {
    public static void main(String[] args) {
        int [] nums = {10, 3, 40, 2, 5, 7, 8};
        int minimum = findTheMinimum(nums);
        System.out.println(minimum);
    }

    private static int findTheMinimum(int[] nums) {
        int minimum = nums[0];

        for (int num : nums) {
            minimum = num < minimum ? num : minimum;
        }
        return minimum;
    }
}
