public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void drive() {
        System.out.println("Car -> drive");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    //Getters
    public String getDescription() {
        return description;
    }

    public void getType() {
        System.out.println(this.getClass().getSimpleName());
    }
}
