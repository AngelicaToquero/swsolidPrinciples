 public class Main {
     public static void main(String[] args) {
         // Create a pet
         Pet myPet = new Pet("Netnet", "Ange");
        
         // Create pet behavior for the pet
         PetBehavior petBehavior = new PetBehavior(myPet);
        
         System.out.println("Pet name: " + myPet.getPetName());
         System.out.println("Owner: " + myPet.getOwner());
        System.out.println("Sound: " + petBehavior.makeSound());
         System.out.println("Eating: " + petBehavior.eat());
     }
 }