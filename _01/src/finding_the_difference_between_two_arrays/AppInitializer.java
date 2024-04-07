package finding_the_difference_between_two_arrays;

import java.util.Arrays;

public class AppInitializer {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7, 8, 10};
        int[] nums2 = {2, 5, 6, 8, 3};

        differenceBetweenArrays(nums1, nums2);
        differenceBetweenArrays(nums2, nums1);
    }

    private static void differenceBetweenArrays(int[] nums1, int[] nums2) {
        DynamicArray intersection = new DynamicArray();

        for (int i = 0; i < nums1.length; i++) {
            boolean isElementExistInArray2 = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    isElementExistInArray2 = true;
                    break;
                }
            }
            if (!isElementExistInArray2) intersection.add(nums1[i]);
        }

        intersection.printArray();
    }
}

class DynamicArray {
    int[] array = new int[0];

    public void add(int x) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }

        newArray[newArray.length - 1] = x;
        array = newArray;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public int[] getArray() {
        return array;
    }
}
