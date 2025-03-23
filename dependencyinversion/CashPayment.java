package dependencyinversion;

class CashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("You are paying in Cash");
    }
}
