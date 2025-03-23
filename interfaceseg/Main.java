package interfaceseg;
public class Main {
    public static void main(String[] args) {
        // Test BasicPhone capabilities
        Phone basicPhone = new BasicPhone();
        basicPhone.makeCall("123-456-7890");
        basicPhone.sendSMS("123-456-7890", "Hello from basic phone");
        
        // Test Samsung smartphone capabilities
        Samsung samsung = new Samsung();
        samsung.makeCall("123-456-7890");
        samsung.sendSMS("123-456-7890", "Hello from Samsung");
        samsung.browseWeb("https://www.example.com");
        samsung.takePicture();
        
        // Test iPhone capabilities
        IPhone iPhone = new IPhone();
        iPhone.makeCall("123-456-7890");
        iPhone.sendSMS("123-456-7890", "Hello from iPhone");
        iPhone.browseWeb("https://www.example.com");
        iPhone.takePicture();
    }
  }