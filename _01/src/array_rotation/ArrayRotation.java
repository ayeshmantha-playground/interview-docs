package array_rotation;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            arrayRotation(array, 1, "lef");
            System.out.println(Arrays.toString(array));
        } catch (NeitherRightOrLeftException e) {
            System.out.println("Side should be either Left OR Right");
        }
    }

    private static void arrayRotation(int[] array, int position, String side) throws NeitherRightOrLeftException {

        if (!(side.equals("right") || side.equals("left"))) {
            throw new NeitherRightOrLeftException();
        }

        if (side.equals("right")) {
            for (int i = 0; i < position; i++) {
                int temp = array[array.length - 1];
                for (int j = 0; j < array.length - 1; j++) {

                    array[array.length - j - 1] = array[array.length - j - 2];
                }
                array[0] = temp;
            }
        } else if (side.equals("left")) {
            for (int i = 0; i < position; i++) {
                int temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
            }

        }
    }
}

class NeitherRightOrLeftException extends Exception {

}
