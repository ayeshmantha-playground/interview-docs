package find_the_maximum_number;

public class AppInitializer {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 8, 10, 20, 6};
        System.out.println(findTheMax(nums));
    }

    private static int findTheMax(int[] nums) {

        int max = nums[0];

        for (int num : nums) {
            max = num > max ? num : max;
        }

        return max;
    }
}
