package facetime;


public class MonkeyKing {
    /**
     * 问题描述为：有100只猴子，从编号为1到100，依次排成一圈，
     * 每数到第7只猴子，就将其淘汰，直到最后只剩下一只猴子为止。
     * 代码会输出最后留下的猴子的编号。
     *
     * @param args
     */
    public static void main(String[] args) {
        int sum = 100;
        int k = 7;
        int kingMoney = findKingMonkey(sum, k);
        System.out.println(kingMoney);
    }

    private static int findKingMonkey(int sum, int k) {
        boolean[] monkeys = new boolean[100];
        for (int i = 0; i < sum; i++) {
            monkeys[i] = true;
        }
        int remainMonkeys = sum;
        int count = 0;
        int index = 0;
        while (remainMonkeys > 1) {
            if (monkeys[index]) {
                count++;
                if (count == k) {
                    monkeys[index] = false;
                    remainMonkeys--;
                    count = 0;
                }
            }
            index++;
            if (index == sum) {
                index = 0;
            }
        }
        return -1;
    }
}
