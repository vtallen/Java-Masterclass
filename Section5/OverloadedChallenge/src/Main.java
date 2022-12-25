// 1 in = 2.54cm
public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(25));
        System.out.println(convertToCentimeters(5, 10));
    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        inches += feet * 12;

        return convertToCentimeters(inches);
    }

}