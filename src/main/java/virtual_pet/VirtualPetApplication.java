package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {


        VirtualPet joey = new VirtualPet("Joey", 50, 50, 50, 50, 50);

        Scanner input = new Scanner(System.in);
//

       while (true);

        System.out.println("Welcome to the VirtualPet Application! ");
        System.out.println("Hunger: " + joey.getHunger());
        System.out.println("Thirst: " + joey.getThirst());
        System.out.println("Waste: " + joey.getWaste());
        System.out.println("Boredom: " + joey.getBoredom());
        System.out.println("Sickness: " + joey.getSickness());
        System.out.println(" ");
        System.out.println("What would like to do?");
        System.out.println("1. Feed Joey.");
        System.out.println("2. Give water to Joey.");
        System.out.println("3. Take Joey for a walk.");
        System.out.println("4. Play with Joey.");
        System.out.println("5. Take Joey to the Doc.");


        while (true);
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        scanner.nextInt();
        if (userChoice == 1){
            System.out.println("You just fed Joey.");

        }








    }

}