import java.time.*;
public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getAge() {
        Year thisYear = Year.now();

        String birthYear = this.birthDate.substring(name.length()-1);
        int yearInt = Integer.parseInt(birthYear);

        return thisYear.getValue() - yearInt;
    }

    //Methods
    public double collectPay() {
        System.out.println("Worker class does not have a pay rate, create a SalariedEmployee or HourlyEmployee");
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
