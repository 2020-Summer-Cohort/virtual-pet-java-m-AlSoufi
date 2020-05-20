package virtual_pet;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {


        VirtualPet joey = new VirtualPet("Joey", 50, 50, 50, 50, 50);

        Scanner scanner = new Scanner(System.in);

        while (true) {


            System.out.println("Welcome to the VirtualPet Application! ");
            System.out.println("Your pet's name is Joey. His stats are below");
            System.out.println("Hunger: " + joey.getHunger());
            System.out.println("Thirst: " + joey.getThirst());
            System.out.println("Waste: " + joey.getWaste());
            System.out.println("Boredom: " + joey.getBoredom());
            System.out.println("Sickness: " + joey.getSickness());
            System.out.println(" ");
            System.out.println("What would like to do?");
            System.out.println("Press 1 to feed Joey.");
            System.out.println("Press 2 to give water to Joey.");
            System.out.println("Press 3 to take Joey for a walk to relieve his bio needs.");
            System.out.println("Press 4 to play with Joey.");
            System.out.println("Press 5 to take Joey to the Doc.");
            System.out.println("Press 6 to Exit.");


            int userChoice = scanner.nextInt();
            scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("You just fed Joey.");
                System.out.println("Joey's current hunger level is:");
                joey.feeding();

            } else if (userChoice == 2) {
                System.out.println("You just gave water to Joey");
                System.out.println("Joey's current thirst level is:");
                joey.watering();
            } else if (userChoice == 3) {
                System.out.println("You just took Joey out for a walk.");
                System.out.println("Joey's current bio needs level is:");
                joey.goForaWalk();
            }
            else if (userChoice == 4) {
                System.out.println("You just played with Joey.");
                System.out.println("Joey's current boredom level is:");
                joey.goForaWalk();
            }
            else if (userChoice == 5) {
                System.out.println("You just took Joey to the doctor.");
                System.out.println("Joey's current sickness level is:");
                joey.goForaWalk();
            }


            else if (userChoice == 6) {
                break;
            }
            joey.tick();
        }
    }
}