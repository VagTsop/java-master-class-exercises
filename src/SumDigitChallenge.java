public class SumDigitChallenge {

    public static void main(String args[]) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(8));
    }

    public static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                // extract the least-significant digit
                int digit = number % 10;
                sum += digit;
                // drop the least-significant digit
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}
