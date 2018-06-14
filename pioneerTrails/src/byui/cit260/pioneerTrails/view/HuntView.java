package byui.cit260.pioneerTrails.view;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tamlyn Laurence
 */
public class HuntView {
    
    public HuntView(){
    }
    
    public void displayHuntView(){
    
    //  System objects
       Scanner in = new Scanner(System.in);
       Random rand = new Random();
       
       //  Game variables
       String[] animals = { "Elk", "Bear", "Buffalo" };
       int maxAnimalAlertness = 75;
       int huntEnergyDrain = 35;
       
       //  Player variables
       int energy = 100;
       int alertnessDamage = 50;
       int numDryBread = 2;
       int dryBreadHealAmount = 30;
       int energizedByHunt = 35;  // Percentage
       
       boolean running = true;
       
       System.out.println("Welcome to the hunt!");
       
       GAME:
       while(running) {
           System.out.println("----------------------------------------------");
           
           int animalAlertness = rand.nextInt(maxAnimalAlertness);
           String animal = animals[rand.nextInt(animals.length)];
           System.out.println("\t# " + animal + " has been spotted! #\n");
           
           while(animalAlertness > 0) {
               System.out.println("\tYour energy level: " + energy);
               System.out.println("\t" + animal + "'s alertness: " + animalAlertness);
               System.out.println("\n\tWhat would you like to do?");
               System.out.println("\t1. Shoot");
               System.out.println("\t2. Eat some dry bread");
               System.out.println("\t3. Run!");

               String input = in.nextLine();
               if(input.equals("1")) {
                   int shotDealt = rand.nextInt(alertnessDamage);
                   int damageEnergy = rand.nextInt(huntEnergyDrain);
                   
                   animalAlertness -= shotDealt;
                   energy -= damageEnergy;
                   
                   System.out.println("\t> You hit the " + animal + " with " + shotDealt + "% damage.");
                   System.out.println("\t> You used " + damageEnergy + "% of your energy!");
                   
                   if(energy < 1) {
                       System.out.println("\t> You have used all your energy reserves.");
                       break;
                   }
               }
               else if(input.equals("2")) {
                   if(numDryBread > 0) {
                       energy += dryBreadHealAmount;
                       numDryBread--;
                       System.out.println("\t> You ate some dry bread, rejuvinating yourself by " + dryBreadHealAmount + "%."
                                        + "\n\t> You now have " + energy + " % energy."
                                        + "\n\t> You have " + numDryBread + " dry bread left.\n");  
                   }
                   else {
                       System.out.println("\t> You have no Dry Bread left! Shoot well so you can get some meat!\n");
                   }
               }              
               else if(input.equals("3")) {
                   System.out.println("\tYou run away from the "  + animal + "!");
                   continue GAME;
               }
               else {
                   System.out.println("\tInvalid command!");
               }       
           }
           
           if(energy < 1) {
               System.out.println("You limp away from the hunt, too weak to carry any meat.");
               break;
           }
           
           System.out.println("----------------------------------------------");
           System.out.println(" # " + animal + " was shot! # ");
           System.out.println(" # You now have " + energy + "% of your energy left. # ");
           if(rand.nextInt(100) < energizedByHunt) {
               numDryBread++;
               System.out.println(" # You could return to camp. # ");

           }
           System.out.println("----------------------------------------------");
           System.out.println("What would you like to do now?");         
           System.out.println("1. Continue hunting");         
           System.out.println("2. Leave the hunt");

           String input = in.nextLine();
           
           while(!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid command!");  
                input = in.nextLine();
           }
           
           if(input.equals("1")){
                System.out.println("You continue on your adventure!");
           }
           else if(input.equals("2")){
                System.out.println("You return to the wagon train laden with meat for all!");
                break;
           }
       }
                  System.out.println("########################");
                  System.out.println("#  Thanks for hunting  #");
                  System.out.println("########################");
    
    }
}
