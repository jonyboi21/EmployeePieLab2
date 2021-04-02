import java.util.ArrayList;

public class HumanResources {


    public void issueBadge(Employee[] employees){
    for(int i =0; i <employees.length; i++){
        System.out.println(employees[i]);
        }
    }

    public void printPaymentInfo(IPayable person){
        System.out.println(person.getClass().getSimpleName() + "Should be paid: " + person.calculatePay());
    }


    public void payPerson(IPayable[] payablePeople){
        for(int i =0; i<payablePeople.length; i++){
            printPaymentInfo(payablePeople[i]);
        }
    }

    public void sortPeopleByIncome(ArrayList<IPayable> payablePeople){
        System.out.println("After sorting people by pay...");
        for(int i=0; i<payablePeople.size(); i++){
            System.out.println(payablePeople.get(i).getClass() + "should be paid: " + payablePeople.get(i).calculatePay());
        }

    }


}
