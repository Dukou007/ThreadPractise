package facetime;

public class PalindromeNumber {
    public static void main(String[] args) {
        long num = 39278187293L;
        if (isPalindromeNumber(num)) {
            System.out.println("y");
        } else {
            System.out.println("N");
        }
    }

    private static boolean isPalindromeNumber(long num) {
        String s = String.valueOf(num);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
