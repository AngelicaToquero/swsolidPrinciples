package dependencyinversion;

class PaymentProcessor {
    public void processPayment(Order order) {
        String paymentMethodType = order.getPaymentMethod();
        PaymentMethod paymentMethod = PaymentMethodFactory.createPaymentMethod(paymentMethodType);
        paymentMethod.processPayment(order.getAmount());
    }
}