package facetime;

public class FibonacciCheck {
    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (a <= num) {
            if (a == num) {
                return true; // 如果num等于当前斐波那契数列的数值，返回true
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false; // 如果循环结束后都没有找到num，返回false
    }

    public static int fibonacciIndex(int num) {
        int a = 0;
        int b = 1;
        int index = 0;
        while (a <= num) {
            if (a == num) {
                return index; // 如果num等于当前斐波那契数列的数值，返回当前索引
            }
            int temp = a + b;
            a = b;
            b = temp;
            index++;
        }
        return -1; // 如果循环结束后都没有找到num，返回-1表示不在斐波那契数列中
    }

    public static void main(String[] args) {
        int num = 21;
        if (isFibonacci(num)) {
            int index = fibonacciIndex(num);
            System.out.println(num + " 是斐波那契数，它是第 " + (index + 1) + " 次出现在斐波那契数列中");
        } else {
            System.out.println(num + " 不是斐波那契数");
        }
    }
}

