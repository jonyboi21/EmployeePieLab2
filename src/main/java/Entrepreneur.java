public class Entrepreneur extends Person implements IPayable{

    //ivar
    int income;


    public Entrepreneur(String name, int income) {
        super(name);
        this.income = income;
    }

    public double calculatePay(){
        return income;
    }

}
