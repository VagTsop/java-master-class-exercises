public class ForStatement {

    public static void main(String args[]) {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                counter++;
                System.out.println("Numbers divided by 3 and 5 " + i);

                if (counter == 5) {
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
        System.out.println("Sum of numbers divided by 3 and 5: " + sum);
        System.out.println("Total numbers divided by 3 and 5: " + counter);
    }
}