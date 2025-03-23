package dependencyinversion;

class PaymentMethodFactory {
    public static PaymentMethod createPaymentMethod(String paymentMethodType) {
        if (paymentMethodType.equals("ewallet")) {
            return new EWalletPayment();
        } else if (paymentMethodType.equals("cash")) {
            return new CashPayment();
        } else if (paymentMethodType.equals("creditcard")) {
            return new CreditCardPayment();
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethodType);
        }
    }
}
