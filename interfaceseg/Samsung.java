package interfaceseg;
class Samsung implements Phone, WebBrowser, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("Samsung: Making a call to " + number);
    }
    
    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung: Sending SMS to " + number + ": " + message);
    }
    
    @Override
    public void browseWeb(String url) {
        System.out.println("Samsung: Browsing " + url);
    }
    
    @Override
    public void takePicture() {
        System.out.println("Samsung: Taking a picture");
    }
}