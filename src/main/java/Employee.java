public class Employee extends Person {


    private HireDate date;

    public Employee(String name, HireDate date) {
        super(name);
        this.date = date;
    }

    public HireDate getDate() {
        return date;
    }

    public void setHireDate(HireDate hireDate) {
        this.date = hireDate;
    }


    public void printBadge() {
        System.out.println("Name: " + name);

    }
}