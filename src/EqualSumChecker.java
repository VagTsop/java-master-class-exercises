public class EqualSumChecker {

    public static void main(String args[]) {

        System.out.println(hasEqualSum(1, 2, 3));
    }

    public static boolean hasEqualSum(int a, int b, int c) {

        int sum = a + b;

        if (sum == c) {
            return true;
        }
        return false;
    }
}
