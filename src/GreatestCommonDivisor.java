public class GreatestCommonDivisor {


    public static void main(String args[]) {
        System.out.println(getGreatestCommonDivisor(25, 15));// should return 5 since both can be divided by 5 without without a remainder
        System.out.println(getGreatestCommonDivisor(12, 30));// should return 6 since both can be divided by 6 without without a remainder
        System.out.println(getGreatestCommonDivisor(9, 18));// should return -1 since the first parameter < 10
        System.out.println(getGreatestCommonDivisor(81, 153));// should return 9 since both can be divided by 9 without without a remainder
    }

    public static int getGreatestCommonDivisor(int numberValuOne, int numberValueTwo) {
        if (numberValuOne >= 10 && numberValueTwo >= 10) {
            while (numberValuOne != numberValueTwo) {
                if (numberValuOne > numberValueTwo)
                    numberValuOne = numberValuOne - numberValueTwo;
                else
                    numberValueTwo = numberValueTwo - numberValuOne;
            }
            return numberValueTwo;
        }
        return -1;
    }
}
