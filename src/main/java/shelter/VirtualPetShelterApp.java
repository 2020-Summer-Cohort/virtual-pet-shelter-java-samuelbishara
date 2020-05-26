package shelter;

import java.util.Scanner;
import java.util.ArrayList;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPet pet1 = new VirtualPet("Javon", " the friendly pitbull.");
        VirtualPet pet2 = new VirtualPet("Diego", " the fiesty chihuahua.");
        VirtualPet pet3 = new VirtualPet("Maria", " a very hyper boxer.  ");
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(pet1);
        shelter.addPet(pet2);
        shelter.addPet(pet3);


        while (true) {
            shelter.printPets();
            System.out.println("Press 1 to feed pets, press 2 to give pets a drink, press 3 to play with individual pets, and 4 to play with petj. ");
            Scanner scanner = new Scanner(System.in);
            int userSelection = scanner.nextInt();

            if (userSelection == 1) {
                shelter.feedPets();
            } else if (userSelection == 2) {
                shelter.waterPets();
            } else if (userSelection == 3) {
                System.out.println("Which pet do you want to play with? Please type the name: ");
                Scanner petScanner = new Scanner(System.in);
                String name = petScanner.nextLine();
                shelter.playWithPet(name);
            } else if (userSelection == 4) {
                System.out.println("What is the name of the pet you want to adopt?");
                Scanner petScanner = new Scanner(System.in);
                String name = petScanner.nextLine();
                shelter.removePet(name);
            }
            if (pet1.getHunger() == 10) {
                System.out.println("Sorry, game over. You forgot to feed me.");
                break;
            }
            if (pet2.getHunger() == 10) {
                System.out.println("Sorry, game over. You forgot to feed me.");
                break;
            }
            if (pet3.getHunger() == 10) {
                System.out.println("Sorry, game over. You forgot to feed me.");
                break;
            }
            if (pet1.getThirst() == 10) {
                System.out.println("Sorry, game over. You forgot to give me water.");
                break;
            }
            if (pet2.getThirst() == 10) {
                System.out.println("Sorry, game over. You forgot to give me water.");
                break;
            }
            if (pet3.getThirst() == 10) {
                System.out.println("Sorry, game over. You forgot to give me water.");
                break;
            }
            }
            if (pet1.getBoredom() == 10) {
                System.out.println("Sorry, game over. You forgot to play with me.");
            }
            if (pet1.getBoredom() == 10) {
                System.out.println("Sorry, game over. You forgot to play with me.");
            }
            if (pet1.getBoredom() == 10) {
                System.out.println("Sorry, game over. You forgot to play with me.");
        }


        }

    }
