public class SalariedEmployee extends Employee implements IPayable{

    private double salary;


    public SalariedEmployee(String name, HireDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public double calculatePay(){
        return (int) salary;
    }




    @Override
    public void printBadge(){
        System.out.println("Name: " + name);
        System.out.println("Type of employee: " + getClass());
        System.out.println("HireDate: " + (getDate()));

    }
}

