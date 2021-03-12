public class FirstAndLastDigit {


    public static void main(String args[]) {
        System.out.println(sumFirstAndLastDigit(252)); //return 4
        System.out.println(sumFirstAndLastDigit(257)); //return 9
        System.out.println(sumFirstAndLastDigit(0));   //return 0
        System.out.println(sumFirstAndLastDigit(5));   //return 10
        System.out.println(sumFirstAndLastDigit(-10)); //return -1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit, firstDigit;
        lastDigit = number % 10;
        firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }
}
