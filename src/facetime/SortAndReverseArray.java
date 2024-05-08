package facetime;

import java.util.Arrays;

public class SortAndReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3, 8, 4, 6}; // 无序的数组

        // 从小到大排序
        Arrays.sort(arr);

        // 输出从小到大排序后的数组
        System.out.println("从小到大排序后的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 反序排列数组
        reverseArray(arr);

        // 输出反序排列后的数组
        System.out.println("反序排列后的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 反序排列数组的方法
    public static void reverseArray(int[] arr) {
        int left = 0; // 左边界索引
        int right = arr.length - 1; // 右边界索引

        // 循环交换数组元素，直到左右指针相遇
        while (left < right) {
            // 交换左右指针对应的元素
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // 更新左右指针
            left++;
            right--;
        }
    }
}
