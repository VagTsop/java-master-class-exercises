public class BarkingDog {

    public static void main(String args[]) {


        System.out.println(shouldWakeUp(true, 8));
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking) {
            if (hourOfDay >= 0 && hourOfDay < 8) {
                return true;
            }
            if (hourOfDay > 22 && hourOfDay <= 23) {
                return true;
            }
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
        }
        return false;
    }
}
