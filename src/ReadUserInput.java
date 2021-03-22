import java.util.Scanner;

public class ReadUserInput {


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // checks to see if the next input is entered is number

        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();// -> nextLine between   nextInt(); and nextLine() below in order to handle the problem which doesnt allows to add name input after birth - * in line  int yearOfBirth = scanner.nextInt(); it interprets the enter we press also as a input for below nextLine and for this reason to fix this issue we add a newxtLine between them

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // nextLine(); --> reads even space in an input  -   next(); --> reads input only till the space
            int age = 2018 - yearOfBirth;


            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " Your age is " + age);
            } else {
                System.out.println("Invalid year Birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
