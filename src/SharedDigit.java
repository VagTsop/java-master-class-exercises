public class SharedDigit {

    public static void main(String args[]) {

        System.out.println(hasSharedDigit(12, 23)); // should return true since the digit 2 appears in both
        System.out.println(hasSharedDigit(9, 99)); // should return false since 9 is not within the range of 10
        System.out.println(hasSharedDigit(15, 55)); // should return true since the digit 5 appears in both numbers
        System.out.println(hasSharedDigit(100, 10)); // should return false
    }


    public static boolean hasSharedDigit(int numberValueOne, int numberValueTwo) {

        if (numberValueOne >= 10 && numberValueOne <= 99 && numberValueTwo >= 10 && numberValueTwo <= 99) {

            int firstValueSecondDigit = numberValueOne % 10;
            int firstValueFirstDigit = numberValueOne / 10;
            int secondValueSecondDigit = numberValueTwo % 10;
            int secondValueFirstDigit = numberValueTwo / 10;

            return firstValueFirstDigit == secondValueFirstDigit || firstValueFirstDigit == secondValueSecondDigit ||
                    secondValueFirstDigit == firstValueSecondDigit || secondValueSecondDigit == firstValueSecondDigit;
        }
        return false;
    }
}





