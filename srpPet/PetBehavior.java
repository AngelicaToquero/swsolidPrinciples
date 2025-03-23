 public class PetBehavior {
     private Pet pet;
    
     public PetBehavior(Pet pet) {
         this.pet = pet;
     }
    
     public String makeSound() {
         return "Meow meow!";
     }
    
     public String eat() {
         return pet.getPetName() + " is eating";
     }
 }