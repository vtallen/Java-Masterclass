public class HourlyEmployee extends  Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, int hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.setHourlyPayRate(hourlyPayRate);

    }

    public void setHourlyPayRate(double hourlyPayRate) {
        if (hourlyPayRate < 0) {
            System.out.println("Pay rate cannot be less than 0! hourlyPayRate not set.");
        } else {
            this.hourlyPayRate = hourlyPayRate;
        }

    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getDoublePay(double numHours) {
        return this.hourlyPayRate * numHours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
