package openclosePrinciple;

public class Main {
    public static void main(String[] args) {
        Customer student = new StudentCustomer("John");
        Customer senior = new SeniorCitizenCustomer("Mary");
        Customer regular = new RegularCustomer("Bob");
        
        double purchaseAmount = 100.0;
        
        System.out.println(student.getName() + " pays: $" + student.applyDiscount(purchaseAmount));
        System.out.println(senior.getName() + " pays: $" + senior.applyDiscount(purchaseAmount));
        System.out.println(regular.getName() + " pays: $" + regular.applyDiscount(purchaseAmount));
    }
}
