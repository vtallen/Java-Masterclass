public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
                    if (row == 1) {
                        System.out.print("*");
                    } else if (row == number) {
                        System.out.print("*");
                    } else if (column == 1) {
                        System.out.print("*");
                    } else if (column == number) {
                        System.out.print("*");
                    } else if (row == column) {
                        System.out.print("*");
                    } else if (column == (number - row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
