package openclosePrinciple;

public abstract class Customer {
    private String name;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // Abstract method for calculating discount
    public abstract double calculateDiscount(double amount);
    
    // This method can stay in the base class
    public double applyDiscount(double amount) {
        return amount - calculateDiscount(amount);
    }
}
