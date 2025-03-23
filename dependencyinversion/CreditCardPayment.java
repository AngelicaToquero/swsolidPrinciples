package dependencyinversion;

class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        CreditCard creditCard = new CreditCard();
        creditCard.charge(amount);
        System.out.println("You are paying using Credit Card");
    }
  }
