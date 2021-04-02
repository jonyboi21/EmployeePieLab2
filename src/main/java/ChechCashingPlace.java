import java.util.ArrayList;

public class ChechCashingPlace {

    public static void main(String[] args) {

        SalariedEmployee S1 = new SalariedEmployee("Jon",new HireDate("Jan", "16", "1998"), 20150);
        S1.printBadge();



        Employee salariedEmployee = new SalariedEmployee("Sally", new HireDate("2", "30","2020"), 10000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Harry", new HireDate("3", "19","1999"), 40, 10);
        Entrepreneur entrepreneur = new Entrepreneur("Jordan", 20000);
        HumanResources humanResources = new HumanResources();

        ArrayList<IPayable> unsortedPeople = new ArrayList<>();
        unsortedPeople.add((IPayable) salariedEmployee);
        unsortedPeople.add((IPayable) hourlyEmployee);
        unsortedPeople.add((IPayable) entrepreneur);
        humanResources.sortPeopleByIncome(unsortedPeople);

    }

}
