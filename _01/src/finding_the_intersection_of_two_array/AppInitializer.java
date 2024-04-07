package finding_the_intersection_of_two_array;

import java.util.Arrays;

public class AppInitializer {
    public static void main(String[] args) {

        int[] nums1 = {1, 8, 4, 6, 9, 10, 2, 3};
        int[] nums2 = {4, 4, 8, 10, 3, 7, 3, 1};

        intersectionOfArrays(nums1, nums2);

    }

    private static void intersectionOfArrays(int[] nums1, int[] nums2) {
        DynamicArray intersection = new DynamicArray();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean exists = false;
                    for (int element : intersection.getArray()) {
                        if (element == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        intersection.add(nums1[i]);
                        break;
                    }
                }
            }
        }

        intersection.printArray();
    }

}

class DynamicArray {
    int[] array = new int[0];

    public void add(int num) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = num;
        array = newArray;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public int[] getArray() {
        return array;
    }
}
