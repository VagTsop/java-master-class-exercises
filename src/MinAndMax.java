import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 0;

        System.out.println("Enter a number : ");
        boolean isAnInt = input.hasNextInt();

        if (!isAnInt) {
            System.out.println("You must enter at least one valid number");
            input.close();
            System.exit(0);
        }

        int firstNumber = input.nextInt();
        input.nextLine();
        min = firstNumber;
        max = min;

        while (true) {
            System.out.println("Enter another number : ");
            boolean isNextInt = input.hasNextInt();

            if (isNextInt) {
                int number = input.nextInt();
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            input.nextLine();
        }

        System.out.println("Your Maximum was " + max +
                " and your Minimum was " + min);

        input.close();
    }

}
