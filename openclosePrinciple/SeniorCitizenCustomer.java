package openclosePrinciple;

public class SeniorCitizenCustomer extends Customer {
    public SeniorCitizenCustomer(String name) {
        super(name);
    }
    
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10; // 10% discount
    }
}