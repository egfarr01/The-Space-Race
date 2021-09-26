/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacerace;
import java.util.Scanner;

/**
 *
 * @author efarrer
 */
public class SpaceRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = " ";
        Scanner scnr = new Scanner(System.in);
        CurrentLocation headquarters = new CurrentLocation("Space Force HQ");
        System.out.println("Welcome to SPACE QUEST a text-based adventure game.");
                wToContinue(scnr, input);
                System.out.println("""
                This project was built by Eli Farrer for the Shellhacks programming
                competition. If you think you have what it takes to trailblaze 
                through the lonely, dark cosmos and chart a new future for mankind 
                you've come to the right place.
                Beware - space is an unforgiving landscape and you'll encounter 
                many hardships on your journey. It's not all astronaut ice cream
                and sunshine. ... Still here? Good. What's your name again, recruit?
                                   """);
        String name = scnr.nextLine();
        System.out.println("Hmmmm, " + name + " is what you like to be called, is that correct?");
        String answer = scnr.nextLine();
        while (answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N")) {
            System.out.println("Well, OK. What should I call you then?");
            name = scnr.nextLine();
            System.out.println("OK, " + name + " it is. I'll call you " + name + ", is that OK?");
            answer = scnr.nextLine();
        }
        System.out.println("How old are you, " + name + "?");
        int age = scnr.nextInt();
        scnr.nextLine();
        if(age < 18) {
            System.out.println("Space is no place for children! Come back when you're older!");
            wToContinue(scnr, input);
            while(age < 18) {
                age++;
                System.out.println("The leaves change color and fall to the ground"
                        + "\nThe fire warms you during the cold months\n"
                        + "In the spring, the world around you reawakens."
                        + "\nBefore you know it another year has passed and you're "
                        + age +".");
                        wToContinue(scnr, input);
            
            }
            System.out.println("Excellent! A fresh set of legs ready to waltz their way"
                    + " across the universe. Glad to have you with us youngling.");
        }
        
        System.out.println("What is your field of expertise??");
        String job = scnr.nextLine();
        System.out.println("Incredible, we've never had a " + job + " expert as a member of"
                + " the Space Force before.\nI see you're eyeing our astronaut ice cream"
                + " on the table over there. Why don't you pick it up?");
        
        
        Player spaceMan = new Player(name, age, job);
        
        printInteractionMenu(scnr, headquarters, spaceMan);
        System.out.println(spaceMan.toString());
        
    }
    
    public static void wToContinue(Scanner scnr, String input){
        while (!input.equalsIgnoreCase("w")) {
            System.out.println("Press \"w\" to continue.");
            input = scnr.nextLine();
        }
    }
    
    public static void printInteractionMenu(Scanner scnr, CurrentLocation headquarters, Player spaceMan) {
        System.out.println("What do you want to do?\n"
                + "1. Look around\n"
                + "2. Look through Inventory\n"
                + "3. Go to Ship\n"
                + "4. Talk to\n"
                + "5. Pick Up Item\n"
                + "6. Distance From Earth");
        int answer = scnr.nextInt();
        
        while(answer > 5 || answer < 1) {
            System.out.println("Nice try, slick. Provide a valid input.");
            answer = scnr.nextInt();
        }
        
        switch(answer) {
            case 1: AreaContents earth = headquarters.defineArea();
                    System.out.println(earth.getAreaDescription());
                    break;
            case 2: System.out.println(spaceMan.getInventory());
                    break;
            case 3: System.out.println("You leave.");
                    break;
            case 4: 
                    break;
                    
        }
        
        
    }
    
}
