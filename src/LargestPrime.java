public class LargestPrime {


    public static void main(String args[]) {

        System.out.println(getLargestPrime(21));// should return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(getLargestPrime(217));// should return 31 since is the largest prime (7 * 31 = 217)
        System.out.println(getLargestPrime(0));// should return -1 since 0 does not have any prime numbers
        System.out.println(getLargestPrime(45));// should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        System.out.println(getLargestPrime(-1));// should return -1 since the parameter is negative


    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        } else {
            int div = 2;
            while (div < number) {
                if (number % div != 0) {
                    div++;
                } else {
                    number = number / div;
                    div = 2;
                }
            }
            return number;
        }
    }
}
