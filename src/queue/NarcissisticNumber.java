package queue;

public class NarcissisticNumber {
    public static void main(String[] args) {
        System.out.println("水仙花数：");
        for (int i = 100; i < 1000; i++) { // 遍历所有的三位数
            if (isNarcissistic(i)) {       // 如果是水仙花数
                System.out.println(i);      // 打印该数
            }
        }
    }
    
    // 判断一个数是否是水仙花数
    public static boolean isNarcissistic(int num) {
        int sum = 0;                     // 初始化立方和为 0
        int temp = num;                  // 临时保存原始数值
        
        // 求各位数的立方和
        while (temp > 0) {
            int digit = temp % 10;       // 获取当前位的数字
            sum += Math.pow(digit, 3);   // 将当前位的立方加到立方和中
            temp /= 10;                  // 去掉最低位
        }
        
        return sum == num;               // 如果立方和等于原始数，返回 true；否则返回 false
    }
}
