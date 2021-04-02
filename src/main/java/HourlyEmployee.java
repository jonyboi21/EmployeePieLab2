public class HourlyEmployee extends Employee implements IPayable{
    private double hourlyRate;
    private double HoursWorked;

    public HourlyEmployee(String name, HireDate date, double hourlyRate, double hoursWorked) {
        super(name, date);
        this.hourlyRate = hourlyRate;
        this.HoursWorked = hoursWorked;
    }



    public double calculatePay() {
        return hourlyRate * HoursWorked;

    }


}



