public class DecimalComparator {

    public static void main(String args[]) {
        System.out.println(areEqualByThreeDecimalPlaces(175.346234, 175.346234));
    }

    public static boolean areEqualByThreeDecimalPlaces(double myDecimalValueOne, double myDecimalValueTwo) {
        myDecimalValueOne = (int) (myDecimalValueOne * 1000d) / 1000d;
        myDecimalValueTwo = (int) (myDecimalValueTwo * 1000d) / 1000d;
        System.out.println("the first value is " + myDecimalValueOne);
        System.out.println("the second value is " + myDecimalValueTwo);
        if (myDecimalValueOne == myDecimalValueTwo) {
            return true;
        }
        return false;
    }

}
