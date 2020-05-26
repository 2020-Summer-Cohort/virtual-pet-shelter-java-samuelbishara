package shelter;

import java.util.ArrayList;

public class VirtualPetShelter {

    ArrayList<VirtualPet> virtualPets = new ArrayList<VirtualPet>();

    public ArrayList getPets() {
        return this.virtualPets;
    }
    public void  addPet(VirtualPet pet) {
        virtualPets.add(pet);
    }
    public void printPets(){
        System.out.println("                   Hunger  Thirst   Boredom");
        for (VirtualPet pet : virtualPets){
            System.out.println(pet.getName() + pet.getDescription() + "|      " + pet.getHunger() + "|      " + pet.getThirst() + "|      " + pet.getBoredom());
        }
        // System.out.println();
    }
    public void feedPets() {
        System.out.println("Let's feed all our pets...");
        for (VirtualPet pet : virtualPets){
            pet.feedPet();
       //     System.out.println(pet.getName() + "|" + pet.getHunger());
        }
        // printPets();
    }

    public void waterPets() {
        System.out.println("Let's water all our pets...");
        for (VirtualPet pet : virtualPets){
            pet.waterPet();
        }
        // printPets();
    }

    public void playWithPet(String name) {
        System.out.println("Let's play with " + name);
        for (VirtualPet pet : virtualPets){
            if (pet.getName().equals(name)) {
                pet.playWithPet();
                break;
            }
        }
        // printPets();
    }

    public void removePet(String name) {
        System.out.println("Yay! " + name + " has been adopted");
        for (VirtualPet pet : virtualPets){
            if (pet.getName().equals(name)) {
                virtualPets.remove(pet);
                break;
            }
        }
        // printPets();
    }

}
