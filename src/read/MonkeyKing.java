package read;

public class MonkeyKing {
    public static void main(String[] args) {
        final int totalMonkeys = 100; // 猴子总数
        final int eliminationInterval = 7; // 淘汰间隔
        boolean[] monkeys = new boolean[totalMonkeys]; // 用于标记猴子是否被淘汰的数组

        // 初始化猴子数组，全部置为存活
        for (int i = 0; i < totalMonkeys; i++) {
            monkeys[i] = true;
        }

        int monkeysLeft = totalMonkeys; // 记录剩余猴子数
        int currentIndex = 0; // 当前猴子的索引

        // 当剩余猴子数大于1时，继续淘汰
        while (monkeysLeft > 1) {
            int count = 0; // 记录数到第几只猴子

            // 遍历猴子数组，数到第7只猴子时淘汰
            while (count < eliminationInterval) {
                // 当前猴子存活时才计数
                if (monkeys[currentIndex]) {
                    count++;
                }
                // 索引移动到下一只猴子
                currentIndex = (currentIndex + 1) % totalMonkeys;
            }

            // 淘汰当前猴子
            monkeys[currentIndex] = false;
            monkeysLeft--;

            // 找到下一个存活的猴子
            while (!monkeys[currentIndex]) {
                currentIndex = (currentIndex + 1) % totalMonkeys;
            }
        }

        // 输出最后留下的猴子的编号
        for (int i = 0; i < totalMonkeys; i++) {
            if (monkeys[i]) {
                System.out.println("最后留下的猴子编号是：" + (i + 1));
                break;
            }
        }
    }
}
