public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;


    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public void addWater() {
        this.coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        this.refrigerator.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        this.dishWasher.setHasWorkToDo(true);
    }

    public void doKitchenWork() {
        this.coffeeMaker.brewCoffee();
        this.dishWasher.doDishes();
        this.refrigerator.orderFood();
    }

}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Coffee is brewing");
        } else {
            System.out.println("There is no work to do!");
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing the dishes");
        } else {
            System.out.println("There are no dishes to do");
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Food is being ordered!");
        } else {
            System.out.println("Food does not need to be ordered");
        }
    }
}