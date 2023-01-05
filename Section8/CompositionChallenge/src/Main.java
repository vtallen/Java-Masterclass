public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Refrigerator refrigerator = new Refrigerator();
        DishWasher dishWasher = new DishWasher();

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);

        smartKitchen.addWater();
        smartKitchen.doKitchenWork();
    }
}