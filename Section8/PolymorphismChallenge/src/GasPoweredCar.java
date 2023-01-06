public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar -> startEngine");
    }

    @Override
    public void drive() {
        System.out.println("GasPoweredCar -> drive");
    }

    @Override
    protected void runEngine() {
        System.out.println("GasPoweredCar -> runEngine");
    }


    //Getters
    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }


}
