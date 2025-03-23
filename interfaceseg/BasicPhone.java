package interfaceseg;
class BasicPhone implements Phone {
    @Override
    public void makeCall(String number) {
        // Implementation for making calls
        System.out.println("BasicPhone: Making a call to " + number);
    }
    
    @Override
    public void sendSMS(String number, String message) {
        // Implementation for sending SMS
        System.out.println("BasicPhone: Sending SMS to " + number + ": " + message);
    }
}