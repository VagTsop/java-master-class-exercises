import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }


    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);
        int count = 0, sum = 0;
        double avg = 0;
        while (true) {
            boolean isAnInt = input.hasNextInt();
            if (isAnInt) {
                int number = input.nextInt();
                sum += number;
                count++;
            } else {
                avg = (double) sum / count;
                break;
            }
            input.nextLine();
        }
        long Average = Math.round(avg);
        System.out.println("SUM = " + sum + " AVG = " + Average);
        input.close();
    }
}

