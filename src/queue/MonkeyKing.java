package queue;

public class MonkeyKing {

    public static void main(String[] args) {
        int totalMonkeys = 100; // 猴子的总数
        int countInterval = 7; // 数到第几只猴子开始淘汰
        int kingMonkey = findKingMonkey(totalMonkeys, countInterval);
        System.out.println("猴王的编号是：" + kingMonkey);
    }

    /**
     * 找出猴王的编号
     *
     * @param totalMonkeys  猴子的总数
     * @param countInterval 数到第几只猴子开始淘汰
     * @return 猴王的编号
     */
    public static int findKingMonkey(int totalMonkeys, int countInterval) {
        // 创建一个数组表示所有的猴子，初始化为true，表示猴子还活着
        boolean[] monkeys = new boolean[totalMonkeys];
        // 初始化，所有猴子都是活着的
        for (int i = 0; i < totalMonkeys; i++) {
            monkeys[i] = true;
        }

        int remainMonkeys = totalMonkeys; // 剩余的猴子数量
        int count = 0; // 数数的计数器
        int index = 0; // 当前猴子的编号

        // 只剩下一只猴子时退出循环，这只猴子就是猴王
        while (remainMonkeys > 1) {
            // 如果猴子还活着
            if (monkeys[index]) {
                count++; // 数数
                // 数到指定的数，淘汰该猴子
                if (count == countInterval) {
                    monkeys[index] = false; // 猴子淘汰
                    remainMonkeys--; // 剩余猴子数量减一
                    count = 0; // 重新开始计数
                }
            }
            index++; // 下一个猴子
            // 如果到了最后一个猴子，重新回到第一个猴子
            if (index == totalMonkeys) {
                index = 0;
            }
        }

        // 找出猴王的编号
        for (int i = 0; i < totalMonkeys; i++) {
            if (monkeys[i]) {
                return i + 1; // 猴王的编号从1开始
            }
        }

        // 如果没有找到猴王，返回-1
        return -1;
    }
}
