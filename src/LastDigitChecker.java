public class LastDigitChecker {


    public static void main(String args[]) {


        System.out.println(hasSameLastDigit(41, 22, 71));// should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit(23, 32, 42));// should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit(9, 99, 999));// should return false since 9 is not within the range of 10-1000

        System.out.println("-------------------------------");

        System.out.println(isValid(10)); // should return true since 10 is in the range of 10 - 1000
        System.out.println(isValid(468)); // should return true since 468 is in the range of 10 - 1000
        System.out.println(isValid(1051)); // should return false since 1051 is not in the range of 10 - 1000


    }


    public static boolean hasSameLastDigit(int firstNumberValue, int secondNumberValue, int thirdNumberValue) {

        if (firstNumberValue >= 10 && secondNumberValue >= 10 && thirdNumberValue >= 10 && firstNumberValue <= 1000 && secondNumberValue <= 1000 && thirdNumberValue <= 1000) {
            int firstValueSecondDigit = firstNumberValue % 10;
            int secondValueSecondDigit = secondNumberValue % 10;
            int thirdValueSecondDigit = thirdNumberValue % 10;

            return firstValueSecondDigit == secondValueSecondDigit ||
                    firstValueSecondDigit == thirdValueSecondDigit ||
                    thirdValueSecondDigit == secondValueSecondDigit;
        }
        return false;
    }

    public static boolean isValid(int number) {

        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}