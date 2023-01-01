public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 0;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = employeeNo++;
    }

    //Getters
    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    //Setters
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
