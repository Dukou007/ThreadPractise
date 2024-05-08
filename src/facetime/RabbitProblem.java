package facetime;


public class RabbitProblem {
    public static void main(String[] args) {
        int mouth = 12;
        int sum = increaseRabbit(12);
        System.out.println(sum);
    }

    private static int increaseRabbit(int i) {
        if (i <= 0) {
            return 0;
        } else if (i == 1 ||i == 2) {
            return 1;
        } else {
            return increaseRabbit(i - 1) + increaseRabbit(i - 2);
        }
    }

}
