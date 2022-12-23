public class Hello {
    public static boolean isMain() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = true;

        if (!isAlien) {
            System.out.println("Is not an alien!");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the the high score");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);


    }
}
