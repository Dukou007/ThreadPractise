package facetime;

import java.util.Arrays;

public class NewBinary {
    public static void main(String[] args) {
        int[] arr = {1, 11, 13, 3, 5, 19, 7, 9, 15, 17};
        int target = 13;
        int index = findNumber(arr, target);
        if (index != -1) {
            System.out.println("index ：" +index);
        } else {
            System.out.println("does not exist");
        }
    }

    private static int findNumber(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }

        }
        return -1;
    }
}
