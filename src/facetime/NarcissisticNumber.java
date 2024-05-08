package facetime;

import org.omg.CORBA.RepositoryIdHelper;

public class NarcissisticNumber {
    public static void main(String[] args) {
        int start = 100;
        int end = 999;
        System.out.println("水仙花数有：");
        for (int i = start; i <= end; i++) {
            if (isNarcissistic(i)) {
                System.out.print(i+"\t");
            }
        }
    }

    private static boolean isNarcissistic(int i) {
        int sum = 0;
        int temp=i;
        while (temp > 0) {
            int digtal = temp % 10;
            sum += Math.pow(digtal, 3);
            temp = temp / 10;
        }

        return sum == i ? true : false;
    }
}
