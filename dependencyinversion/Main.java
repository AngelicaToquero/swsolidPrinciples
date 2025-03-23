package dependencyinversion;

public class Main {
    public static void main(String[] args) {
        // Create sample orders
        Order cashOrder = new Order("cash", 100.0);
        Order creditCardOrder = new Order("creditcard", 200.0);
        Order eWalletOrder = new Order("ewallet", 150.0);
        
        // Create payment processor
        PaymentProcessor processor = new PaymentProcessor();
        
        // Process different types of payments
        System.out.println("Processing cash payment:");
        processor.processPayment(cashOrder);
        
        System.out.println("\nProcessing credit card payment:");
        processor.processPayment(creditCardOrder);
        
        System.out.println("\nProcessing e-wallet payment:");
        processor.processPayment(eWalletOrder);
        
        // Try an invalid payment method
        try {
            Order invalidOrder = new Order("bitcoin", 300.0);
            System.out.println("\nProcessing invalid payment method:");
            processor.processPayment(invalidOrder);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
  }
