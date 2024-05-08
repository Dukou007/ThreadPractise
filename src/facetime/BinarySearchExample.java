package facetime;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // 有序数组
        int target = 13; // 要查找的目标元素

        // 调用二分查找函数查找目标元素
        int result = Arrays.binarySearch(arr, target);
        Arrays.parallelSort(arr);

        // 输出查找结果
        if (result != -1) {
            System.out.println("目标元素 " + target + " 的索引为：" + result);
        } else {
            System.out.println("目标元素 " + target + " 不存在于数组中。");
        }
    }

    /*private static int binarySearchNumber(int[] arr, int target) {
        int left = 0; // 左边界
        int right = arr.length - 1; // 右边界

        // 当左边界小于等于右边界时，继续查找
        while (left <= right) {
            int mid = left + (right - left) / 2; // 计算中间元素的索引

            // 如果中间元素等于目标元素，则直接返回中间元素的索引
            if (arr[mid] == target) {
                return mid;
            }

            // 如果中间元素小于目标元素，则在右半部分继续查找
            else if (arr[mid] < target) {
                left = mid + 1; // 更新左边界为中间元素的右边一位
            }

            // 如果中间元素大于目标元素，则在左半部分继续查找
            else {
                right = mid - 1; // 更新右边界为中间元素的左边一位
            }
        }

        // 如果没有找到目标元素，则返回 -1
        return -1;
    }*/
}

