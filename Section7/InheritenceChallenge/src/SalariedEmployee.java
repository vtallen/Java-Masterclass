public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    //Getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    //Setters
    public void setAnnualSalary(double annualSalary) {
        if (annualSalary < 0) {
            System.out.println("Salary cannot be less than 0! Salary not set");
        } else {
            this.annualSalary = annualSalary;
        }
    }

    public void retire() {
        this.isRetired = true;
    }

    //Methods
    @Override
    public double collectPay() {
        return annualSalary / 24;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
