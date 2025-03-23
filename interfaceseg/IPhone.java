package interfaceseg;
class IPhone implements Phone, WebBrowser, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("iPhone: Making a call to " + number);
    }
    
    @Override
    public void sendSMS(String number, String message) {
        System.out.println("iPhone: Sending SMS to " + number + ": " + message);
    }
    
    @Override
    public void browseWeb(String url) {
        System.out.println("iPhone: Browsing " + url);
    }
    
    @Override
    public void takePicture() {
        System.out.println("iPhone: Taking a picture");
    }
}