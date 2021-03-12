public class EvenDigitSum {

    public static void main(String args[]) {
        System.out.println(getEvenDigitSum(123456789)); // should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252)); // should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22)); // should return -1 since the number is negative
        System.out.println(getEvenDigitSum(0)); // should return 0
    }

    public static int getEvenDigitSum(int number) {
        int sum;
        int digit;
        if (number >= 0) {
            sum = 0;
            while (number > 0) {
                digit = number % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}

