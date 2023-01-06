public class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar -> startEngine");
    }

    @Override
    public void drive() {
        System.out.println("HybridCar -> drive");
    }

    @Override
    protected void runEngine() {
        System.out.println("HybridCar -> runEngine");
    }

    //Getters
    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
