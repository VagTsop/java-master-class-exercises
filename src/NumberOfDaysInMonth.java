public class NumberOfDaysInMonth {

    public static void main(String args[]) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(getDaysInMonth(12, 10000));

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {

                        return true;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int days;


        switch (month) {

            case 1: /* Jan */
            case 3: /* March*/
            case 5: /* May */
            case 7: /* July */
            case 8: /* August */
            case 10: /* October */
            case 12: /* December */
                days = 31;
                if (!isLeapYear(year)) {
                    if (year < 1 || year > 9999) {
                        return -1;
                    }
                }

                break;

            case 2: // Feb
                days = 28;

                if (isLeapYear(year)) {
                    days = 29;
                }

                break;

            case 4: /* April */
            case 6: /* June */
            case 9: /* September */
            case 11: /* November */
                days = 30;
                break;

            default:
                return -1;

        }
        return days;
    }
}



