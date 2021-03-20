public class DiagonalStar {


    public static void main(String[] args) {
        printSquareStar(5);
    }


    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || col == 1 || col == number) {
                    System.out.print("*");
                } else if (row == col) {
                    System.out.print("*");
                } else if (col == (number - row + 1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }// close inner loop
            System.out.println();

        }// close outter loop
    }
}


//    public static void printSquareStar(int number) {
//        char space = ' ';
//        if (number < 5) {
//            System.out.println("Invalid Value");
//        }
//        for (int i = 0; i < number; i++) {
//            System.out.print("*");
//            for (int j = 0; j < number - 1; j++) {
//                if (i == 1 && j == 1) {
//                    System.out.print(space);
//                    if (j == 1) {
//                        continue;
//                    }
//                }
//                if (i == 2) {
//                    if (j == 0) {
//                        System.out.print(space);
//                        continue;
//                    }
//                    if (j == 2) {
//                        System.out.print(space);
//                        continue;
//                    }
//                }
//                if (i == 3 && j == 1) {
//                    System.out.print(space);
//                    if (j == 1) {
//                        continue;
//                    }
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


