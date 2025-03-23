package dependencyinversion;

class EWalletPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        EWallet ewallet = new EWallet();
        ewallet.pay(amount);
        System.out.println("You are paying in GCash");
    }
  }